package com.example.visma.Controller;


import com.example.visma.entity.Meetings;
import com.example.visma.repository.MeetingDao;
import com.example.visma.entity.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/meetings")
public class MeetingController {

    @Autowired
    private MeetingDao meetingDao;

    @GetMapping(path="/", produces = "application/json")
    public Meetings getMeetings()
    {
        return meetingDao.getAllMeetings();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addMeeting(@RequestBody Meeting meeting)
    {
        Integer id = meetingDao.getAllMeetings().getMetingList().size() + 1;
        meeting.setId(id);

        meetingDao.addMeeting(meeting);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(meeting.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}