package com.rls.backend.barber;

import com.rls.backend.barber.domain.Barber;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BarberMapper {
    BarberMapper INSTANCE = Mappers.getMapper(BarberMapper.class);

    Barber toEntity(BarberRequestDTO request);
    BarberResponseDTO toResponse(Barber barber);
    List<BarberResponseDTO> toResponseList(List<Barber> barbers);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateEntityFromRequest(BarberRequestDTO request, @MappingTarget Barber barber);
}
