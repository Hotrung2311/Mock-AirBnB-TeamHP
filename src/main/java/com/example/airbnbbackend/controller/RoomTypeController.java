//package com.example.airbnbbackend.controller;
//
//import com.example.airbnbbackend.model.RoomType;
//import com.example.airbnbbackend.service.RoomTypeService;
//import com.example.airbnbbackend.service.ServiceResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping("/api/room-type")
//public class RoomTypeController {
//    @Autowired
//    private RoomTypeService roomTypeService;
//
//    @GetMapping
//    public ResponseEntity<ServiceResult> listRoomType() {
//        return new ResponseEntity<>(roomTypeService.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ServiceResult> getRoomTypeById(@PathVariable Long id){
//        return new ResponseEntity<>(roomTypeService.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<ServiceResult> createRoomType(@RequestBody RoomType roomType){
//        return new ResponseEntity<>(roomTypeService.createRoomType(roomType), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<ServiceResult> deleteRoomType(@PathVariable long id){
//        return new ResponseEntity<>(roomTypeService.deleteRoomType(id), HttpStatus.OK);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ServiceResult> updateRoomType(@RequestBody RoomType roomType){
//        return new ResponseEntity<>(roomTypeService.updateRoomType(roomType),HttpStatus.OK);
//    }
//}