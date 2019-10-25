package org.xujin.halo.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujin
 */
@RestController
@RequestMapping("/admin/app")
public class AppController {

    @GetMapping("/{id}")
    public String getApp(@PathVariable Long id) {
        System.out.println("-----Spring Test-----"+id);
        return "Hi,Spring Test";
    }



}
