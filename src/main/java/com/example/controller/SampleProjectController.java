package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.SampleProject;
import com.example.repository.SampleProjectRepository;
//@CrossOriginは、CORSの設定
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/")
public class SampleProjectController {
  @Autowired
  SampleProjectRepository sampleProjectRepository;

  @GetMapping("/sample")
  public ResponseEntity<List<SampleProject>> getUserInfo(@RequestParam(required = false) String userName) {
    List<SampleProject> list = sampleProjectRepository.findByUserName(userName);
    return new ResponseEntity<List<SampleProject>>(list, HttpStatus.OK);
  }
}
