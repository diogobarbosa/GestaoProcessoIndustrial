package org.indtexbr.gestaoprocessoindustrial.ports;

import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.VendaEntity;
import org.springframework.data.repository.CrudRepository;

public interface VendaRepository extends CrudRepository<VendaEntity, UUID>{

}
