package org.indtexbr.gestaoprocessoindustrial.ports;

import java.util.UUID;

import org.indtexbr.gestaoprocessoindustrial.application.entities.CompraEntity;
import org.springframework.data.repository.CrudRepository;

public interface CompraRepository extends CrudRepository<CompraEntity, UUID>{

}
