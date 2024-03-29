package com.foxwho.demo.service;

import com.robert.vesta.service.intf.IdService;
import com.robert.vesta.service.bean.Id;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UidService {

    @Resource
    private IdService idService;

    public long genId() {
        return idService.genId();
    }

    public Id explainId(long id) {
        return idService.expId(id);
    }

    public long makeId(long version, long type, long genMethod, long machine, long time, long seq) {

        long madeId = -1;
        if (time == -1 || seq == -1)
            throw new IllegalArgumentException("Both time and seq are required.");
        else if (version == -1) {
            if (type == -1) {
                if (genMethod == -1) {
                    if (machine == -1) {
                        madeId = idService.makeId(time, seq);
                    } else {
                        madeId = idService.makeId(machine, time, seq);
                    }
                } else {
                    madeId = idService.makeId(genMethod, machine, time, seq);
                }
            } else {
                madeId = idService.makeId(type, genMethod, machine, time, seq);
            }
        } else {
            madeId = idService.makeId(version, type, genMethod, time,
                    seq, machine);
        }

        return madeId;
    }

}