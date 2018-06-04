package zw.co.getcash.integrations.zimswitch.repository;

import zw.co.getcash.integrations.zimswitch.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
