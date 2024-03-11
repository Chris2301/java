package nl.kick.javaspringapi.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Rest API testing Exceptions inside a API.
 *
 * This looks straightforward but out of the box, Exception testing to now work with MockMVC.
 * A ExceptionHandler is necessary as explained in the test.
 */
@RestController
@RequestMapping("rest/hotelguest/")
public class HotelGuestExceptionsController {

    @GetMapping(path = "{id}", produces = "application/json")
    public String getGuestName(@PathVariable int id) throws Exception {

        if (id > 99) {
            throw new Exception("Not so many guests possible....sorry!");
        }

        return "The name for id:" + id + " is Henk";
    }

}