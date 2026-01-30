package com.rls.backend.barber;

import com.rls.backend.barber.domain.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Long> {

}
