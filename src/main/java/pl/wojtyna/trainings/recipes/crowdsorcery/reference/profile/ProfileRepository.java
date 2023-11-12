package pl.wojtyna.trainings.recipes.crowdsorcery.reference.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts")
public interface ProfileRepository extends JpaRepository<Profile, UUID> {
}
