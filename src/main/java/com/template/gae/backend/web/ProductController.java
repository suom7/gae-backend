package com.template.gae.backend.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("products")
@Slf4j
public class ProductController {
    /**
     * create node with json
     * 
     * @param request
     * @param body
     * @return
     */
    @RequestMapping(value = "v1/json", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Void> create(HttpServletRequest request) {
        log.info("============= create ==========");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * create node with form
     * 
     * @param request
     * @param body
     * @return
     */
    @RequestMapping(value = "v1", method = RequestMethod.POST)
    public ResponseEntity<Void> createWithForm(HttpServletRequest request) {
        log.info("============= create ==========");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * find node by id
     * 
     * @param request
     * @param id
     * @return
     */
    @RequestMapping(value = "v1/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> findById(HttpServletRequest request, @PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * update node with id
     * 
     * @param request
     * @param id
     * @param body
     * @return
     */
    @RequestMapping(value = "v1/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Void> update(HttpServletRequest request, @PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Get nodes with pagination
     * 
     * @param request
     * @param limit
     * @param offset
     * @return
     */
    @RequestMapping(value = "v1", method = RequestMethod.GET)
    public ResponseEntity<Void> getPage(HttpServletRequest request, @RequestParam(value = "limit", defaultValue = "10") int limit,
            @RequestParam(value = "offset", defaultValue = "0") String offset) {
        log.info("============= getPage ==========");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Get all notes
     * 
     * @param request
     * @return
     */
    @RequestMapping(value = "v1/all", method = RequestMethod.GET)
    public ResponseEntity<Void> getAll(HttpServletRequest request) {
        log.info("============= getAll ==========");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
