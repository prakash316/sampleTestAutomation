package com.testWeb.utility;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ServiceRequest {
    private String id;

    //Dates
    private Date modifiedDate;
    private Date createdDate;

    //Customer Details
    private String uniqueId;
    private String name;
    private String phone;
    private String email;
    private String location;
    private String city;
    private String state;

    //Service Request Details
    private Integer customerBudget;
    private String customerBudgetDescription;
    private String estimatedProjectStartDate;
    private String comment;
    private List<Object> comments = new ArrayList<>();
    private Object displayableServiceId;
    private Boolean isFloorPlanRequired;
    private Integer noOfFloors;
    private org.bson.Document serviceDetail;

    private Object plotInformation;
    private Boolean isReferral;


    //Customer Support Details
    private Object srInterestLevel;
    private Object adminSRStatus;
    private String tasks;

    // Customer Score Attributes
    private Integer projectSize;


    private String employeeId;
    private String insideSalesEmployeeId;
    private Boolean isExperienceCenterFlow;
    //UTM Parameters
    private String utmSource;
    private String utmMedium;
    private String utmCampaign;
    private String utmContent;
    private String utmTerm;

    private String referredBy;
    private String referredByPhone;
    private String referredByEmail;

    private Boolean isEarlyStage;
    private String referralCode;
    private String offerCode;
    private Object serviceRequestSource;

    //also we can say channels
    private Object adSource;

    //for google ads please
    private String gclid;


    private List<String> secondaryPhoneNos = new ArrayList<>();
    private List<String> secondaryEmailIds = new ArrayList<>();
    private String plotLocationLatitude;
    private String plotLocationLongitude;
    private Object customerLocation;
    private String address;

    //Customer Support Details
    private Boolean isBnBUspExplained;
    private Boolean isQuotationProvided;
    private Boolean isCustomerGoingForLoan;
    private Boolean isKhataInCustomerName;

    private String outsideSalesEmployeeId;
    private String customerSupportEmployeeId;
    private String projectManagerId;

    private String csComments;

    // Customer Score Attributes
    private Integer customerPersonalityScore;
    private Integer modernityScore;

    //Related Fields
    private String projectId;
    private String contractorAssignedId;
    private String constructionProfessionalId;
    private String contractId;
    private Integer numTransactions;

    //Deprecated Fields
    private Boolean isImportant;

    private Boolean is60DaysOld;

    private Boolean isWhatsappGroupCreated;

    private Boolean isWhatsappToBeGroupCreated;
    private Boolean isWhatsappAsked;

    private Integer noOfLastCallsDidntConnected;


    private Boolean isContractorNeeded;


    // Know Your Project
    // KYP-General Information
    Object constructionType;
    List<String> unitsInProject = new ArrayList<>();
    Object constructionPurpose;
    Object isPackageOrBoq;
    List<String> packageSelected = new ArrayList<>();
    List<Object> rulingBody = new ArrayList<>();
    Object transferType;
    Object projectState;
    Boolean materialSuppliedByScmTeam;
    Double scmAmount;
    Double scmPercentageOfNDV;
    Double nonDiscountedProjectValue;

    // KYP-Plot information
    Integer plotArea;
    Integer numberOfBusinessUnits;
    Integer numberOfResidentialUnits;
    //Integer noOfFloors;
    Object mainGate;
    String communityGateName;
    Boolean isCornerPlot;
    Boolean regularOrIrregularPlot;
    Object constructionMethods;
    Object architectureType;
    Integer numSidesRoadFacing;
    List<Object> roadFacingSideDirection = new ArrayList<>();
    Object rockyTerrain;
    Double distanceFromMainRoad;
    Double heightFromMainRoad;
    Boolean porticoPresent;
    Double underGroundWaterLevel;

    private Double channelPartnerCommissionPercentage;


    private String customerLocationLatitude;
    private String customerLocationLongitude;

    private Object customerInformation;

    private Boolean isQualifiedMeeting;

    // Statuses
    private Object serviceRequestStatus;
    private Object action;
    private Date actionDate;
    private Object serviceRequestState;
    private Object plotInCustomerName;
    private Object planApproval;
    private Object homeLoanSanctioned;

    private String schedulerEmployeeId;


    private Object serviceRequestReason;

    private Object siteDetails;

    private Object language;
    private String channel;

    private Boolean isDeleted;
    private String deletedByEmployeeUserId;

    private String customerSentiment;

    // variable to keep track if sr has final design marked
    private boolean hasFinalDesignVersion;

    private Object projectType;
    private Double developerCommissionPercentage;
    private Boolean isVaastuCompliant;
    private Boolean isDuplex;
    private Boolean hasBasement;
    private Integer numberOfCarPark;
    private Boolean liftRequire;

    private List<Object> additionalItems = new ArrayList<>();

    private  String hearAboutBricknBolt;
    private String freeText;
    private Long referrerPhoneNumber;

    private Boolean isOsToRmHandoverDone;

    private String pinCode;
    private String gaClientId;
    private String srcUrl;
    private String url;//location url of customers plot/land
    private Object cityStatus;
    private Object leadQualificationStatus;
    private String khataType;
    private Boolean visitedExperienceCenter;

    private String incomingCallNumber;
    private String countryCallingCode;
    private String callingCountry;

    //Mygate
    private String campaignId;
    private String questionBudget;
    private String questionCity;
    private String questionStartDate;
    private String metaLeadId;

}

