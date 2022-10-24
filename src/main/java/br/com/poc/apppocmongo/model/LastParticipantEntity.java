package br.com.poc.apppocmongo.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lastParticipants")
public class LastParticipantEntity {

	@Id
    private String id;
	
	private String partitionKey; // businessEntity.document.identification+businessEntity.document.rel+loggedUser.document.identification+loggedUser.document.rel+creditorAccountDto.ispb

	private String businessEntityId; // businessEntity.document.identification - Número do documento de identificação
									// oficial do titular pessoa jurídica. FONTE:
									// https://openbankingbrasil.atlassian.net/wiki/spaces/DraftOB/pages/74154183/Informa+es+T+cnicas+-+Pagamentos+-+v1.2.0
	private String businessEntityRel; // businessEntity.document.rel - Tipo do documento de identificação oficial do
										// titular pessoa jurídica. FONTE:
										// https://openbankingbrasil.atlassian.net/wiki/spaces/DraftOB/pages/74154183/Informa+es+T+cnicas+-+Pagamentos+-+v1.2.0
	private String loggedUserId; // loggedUser.document.identification - Número do documento de identificação
								// oficial do usuário. FONTE:
								// https://openbankingbrasil.atlassian.net/wiki/spaces/DraftOB/pages/74154183/Informa+es+T+cnicas+-+Pagamentos+-+v1.2.0
	private String loggedUserRel; // loggedUser.document.rel - Tipo do documento de identificação oficial do
									// usuário. FONTE:
									// https://openbankingbrasil.atlassian.net/wiki/spaces/DraftOB/pages/74154183/Informa+es+T+cnicas+-+Pagamentos+-+v1.2.0

	private String ispb; //

	private String brandId; // authorisationServerId

	private LocalDateTime createdDate;

	public LastParticipantEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LastParticipantEntity(String id, String partitionKey, String businessEntityId, String businessEntityRel,
			String loggedUserId, String loggedUserRel, String ispb, String brandId, LocalDateTime createdDate) {
		super();
		this.id = id;
		this.partitionKey = partitionKey;
		this.businessEntityId = businessEntityId;
		this.businessEntityRel = businessEntityRel;
		this.loggedUserId = loggedUserId;
		this.loggedUserRel = loggedUserRel;
		this.ispb = ispb;
		this.brandId = brandId;
		this.createdDate = createdDate;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPartitionKey() {
		return partitionKey;
	}

	public void setPartitionKey(String partitionKey) {
		this.partitionKey = partitionKey;
	}

	public String getBusinessEntityId() {
		return businessEntityId;
	}

	public void setBusinessEntityId(String businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public String getBusinessEntityRel() {
		return businessEntityRel;
	}

	public void setBusinessEntityRel(String businessEntityRel) {
		this.businessEntityRel = businessEntityRel;
	}

	public String getLoggedUserId() {
		return loggedUserId;
	}

	public void setLoggedUserId(String loggedUserId) {
		this.loggedUserId = loggedUserId;
	}

	public String getLoggedUserRel() {
		return loggedUserRel;
	}

	public void setLoggedUserRel(String loggedUserRel) {
		this.loggedUserRel = loggedUserRel;
	}

	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	
}