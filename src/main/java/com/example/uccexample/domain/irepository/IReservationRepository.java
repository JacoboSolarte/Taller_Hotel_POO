package com.example.uccexample.domain.irepository;
import java.util.List;

import com.example.uccexample.domain.dto.ReservationDTO;

public interface  IReservationRepository {

    List<ReservationDTO> getAll();
    ReservationDTO save(ReservationDTO reservationDto);
    void delete(ReservationDTO reservationDto);
    ReservationDTO findById(Long id);
    
}
