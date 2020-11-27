package com.romanjaik;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CallbackService implements ICallbackService
{
    private final AtomicLong counter = new AtomicLong();

    private final Set<Callback> callbacks = new HashSet<>(Set.of(new Callback(counter.incrementAndGet(), "9789C07F-862F-4943-BDF1-1E5E93A521D0","ADDED","82837462",null,"ADDED","ASAP","AAA, BBB Express","14.10.2020 09:57"),
            new Callback(counter.incrementAndGet(), "A93B982D-1ECC-4890-BAEE-834986796605101","ADDED","37128376",null,"ADDED","ASAP","Courier","14.10.2020 08:58"), new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E1BE","ADDED","28232342",null,"ADDED","ASAP","ASD","14.10.2020 10:19"),
            new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E1BT","ADDED","28232347",null,"ADDED","ASAP","ASP","14.10.2020 10:15"),
            new Callback(counter.incrementAndGet(), "A93B982D-1ECC-4890-BAEE-834986796605102","ADDED","37128376",null,"ADDED","ASAP","Courier","14.10.2020 08:58"), new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E2BE","ADDED","28232342",null,"ADDED","ASAP","ASD","14.10.2020 10:20"),
            new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E1BT","ADDED","28232347",null,"ADDED","ASAP","ASP","14.10.2020 10:16"),
            new Callback(counter.incrementAndGet(), "A93B982D-1ECC-4890-BAEE-834986796605103","ADDED","37128376",null,"ADDED","ASAP","Courier","14.10.2020 08:58"), new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E3BE","ADDED","28232342",null,"ADDED","ASAP","ASD","14.10.2020 10:21"),
            new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E1BT","ADDED","28232347",null,"ADDED","ASAP","ASP","14.10.2020 10:17"),
            new Callback(counter.incrementAndGet(), "A93B982D-1ECC-4890-BAEE-834986796605104","ADDED","37128376",null,"ADDED","ASAP","Courier","14.10.2020 08:58"), new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E4BE","ADDED","28232342",null,"ADDED","ASAP","ASD","14.10.2020 10:22"),
            new Callback(counter.incrementAndGet(), "B4EBCC1D-5910-4E38-88E4-902D4663E1BT","ADDED","28232347",null,"ADDED","ASAP","ASP","14.10.2020 10:18")));


    public boolean delete(Long id) {

        var isRemoved = this.callbacks.removeIf(callback -> callback.getId().equals(id));

        return isRemoved;
    }

    public Set<Callback> all() {

        return this.callbacks;
    }
}
