package com.vstu.department.service.mapper;

import com.vstu.department.dto.ParameterGroupDTO;
import com.vstu.department.model.ParameterGroup;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ParameterGroupDTOMapper implements EntityToDTOMapper<ParameterGroupDTO, ParameterGroup, ParameterGroupDTO> {

    private final ModelMapper mapper = new ModelMapper();

    @Override
    public ParameterGroupDTO toDTO(ParameterGroup entity, Object... args) {
        return mapper.map(entity, ParameterGroupDTO.class);
    }

    @Override
    public ParameterGroup toEntity(ParameterGroupDTO dto, Object... args) {
        return null;
    }
}
