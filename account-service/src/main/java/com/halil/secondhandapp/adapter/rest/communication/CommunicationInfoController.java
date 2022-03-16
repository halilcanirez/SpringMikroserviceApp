package com.halil.secondhandapp.adapter.rest.communication;


import com.halil.secondhandapp.domain.communication.CommunicationInfo;
import com.halil.secondhandapp.domain.communication.CommunicationInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommunicationInfoController {

    private final CommunicationInfoService communicationInfoService;

    @PostMapping("/createCommunication")
    public Long createCommunication(@RequestBody @Valid CommunicationCreateRequest request){
        return communicationInfoService.createCommunicationInfo(request.convert());
    }

    @GetMapping("/communication/{id}")
    public List<CommunicationResponse> retrieveCommunicationInfo(@PathVariable Long id){
        List<CommunicationInfo> communicationInfos= communicationInfoService.retrieveCommunicationInfos(id);
        return CommunicationResponse.convertToResponseList(communicationInfos);
    }
}
