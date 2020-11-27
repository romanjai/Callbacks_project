package com.romanjaik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Set;
import lombok.var;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CallbackController
{
@Autowired
private ICallbackService callbackService;

@GetMapping(value="/callback")
public ResponseEntity<Set<Callback>> all() {
    return ok().body(callbackService.all());
}

    @DeleteMapping(value = "/callback/{id}")
    public ResponseEntity<Long> deletePost(@PathVariable Long id) {

        var isRemoved = callbackService.delete(id);

        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}