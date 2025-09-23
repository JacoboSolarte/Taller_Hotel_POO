package com.example.uccexample.domain.irepository;
import java.util.List;

import com.example.uccexample.domain.dto.RoomDTO;

public interface IRoomRepository {

    List<RoomDTO> getAll();
    RoomDTO save(RoomDTO roomDto);
    void delete(RoomDTO roomDto);
    RoomDTO findById(int number);
    
    
}
