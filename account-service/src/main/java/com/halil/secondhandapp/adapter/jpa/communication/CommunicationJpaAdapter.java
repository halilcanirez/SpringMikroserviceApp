package com.halil.secondhandapp.adapter.jpa.communication;

import com.halil.secondhandapp.domain.communication.CommunicationInfo;
import com.halil.secondhandapp.domain.exception.ExceptionType;
import com.halil.secondhandapp.domain.exception.SecondhandDataNotFoundException;
import com.halil.secondhandapp.domain.port.CommunicationPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommunicationJpaAdapter implements CommunicationPersistencePort {

    private final CommunicationJpaRepository communicationJpaRepository;

    @Override
    public Long createCommunicationInfo(CommunicationInfo info) {
         return communicationJpaRepository.save(CommunicationInfoEntity.convertToEntity(info)).getId();
    }


    @Override
    public List<CommunicationInfo> retrieveCommunicationInfos(Long accountId) {

        List<CommunicationInfoEntity> communicationInfoEntityList = communicationJpaRepository.findAllByAccount_Id(accountId);
        return communicationInfoEntityList.stream()
                .map(CommunicationInfoEntity::convertToModel)
                .collect(Collectors.toList());

    }

    @Override
    public Long delete(Long id) {
        communicationJpaRepository.deleteById(id);
        return 1L;
    }

    @Override
    public CommunicationInfo updateCommunicationInfos(Long id) {
        return null;
    }

    private CommunicationInfoEntity retrieveCommunicationInfo(Long id){
        Optional<CommunicationInfoEntity> optionalCommunicationInfoEntity =  communicationJpaRepository.findById(id);

        if (optionalCommunicationInfoEntity.isPresent()){
            return optionalCommunicationInfoEntity.get();
        }
        else{
            throw new SecondhandDataNotFoundException(ExceptionType.ACCOUNT_DATA_NOT_FOUND);
        }

    }
}
