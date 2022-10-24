package br.com.poc.apppocmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.poc.apppocmongo.model.LastParticipantEntity;

public interface LastParticipantRepository extends MongoRepository<LastParticipantEntity, String> {

	List<LastParticipantEntity> findByBusinessEntityIdAndBusinessEntityRelAndLoggedUserIdAndLoggedUserRel(
			String businessEntityId, String BusinessEntityRel, String LoggedUserId, String loggedUserRel);

}
