package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import be.aktina.smartsearch.model.organization.Organization;

public class RootObject {
    private Context context;
    private String[] type =new String[] {
    		"s:Product"
    };
    
    
    @JsonInclude(Include.NON_NULL)
    private PreparationInformation preparationInformation;
    @JsonInclude(Include.NON_NULL)
    private String id;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] sname;
    private String gtin;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] regulatedProductName;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] productRange;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode sbrand;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] sdescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] additionalProductDescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] productMarketingMessage;
    @JsonInclude(Include.NON_NULL)
    private Simage simage;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] productFeatureBenefit;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] productFormDescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] variantDescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] productionVariantDescription;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent productionVariantEffectiveDateTime;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] scolor;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] functionalName;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] gpcCategoryDescription;
    @JsonInclude(Include.NON_NULL)
    private String gpcCategoryCode;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] warningCopyDescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] includedAccessories;
    @JsonInclude(Include.NON_NULL)
    private Organization smanufacturer;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode manufacturingPlant;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent isProductRecalled;
    @JsonInclude(Include.NON_NULL)
    private ManufacturersWarranty manufacturersWarranty;
    @JsonInclude(Include.NON_NULL)
    private String sproductID;
    @JsonInclude(Include.NON_NULL)
    private Mesure netWeight;
    @JsonInclude(Include.NON_NULL)
    private Mesure grossWeight;
    @JsonInclude(Include.NON_NULL)
    private Mesure drainedWeight;
    @JsonInclude(Include.NON_NULL)
    private Mesure netContent;
    @JsonInclude(Include.NON_NULL)
    private Mesure inPackageHeight;
    @JsonInclude(Include.NON_NULL)
    private Mesure inPackageWidth;
    @JsonInclude(Include.NON_NULL)
    private Mesure inPackageDepth;
    @JsonInclude(Include.NON_NULL)
    private Mesure inPackageDiameter;
    @JsonInclude(Include.NON_NULL)
    private Mesure outOfPackageHeight;
    @JsonInclude(Include.NON_NULL)
    private Mesure outOfPackageWidth;
    @JsonInclude(Include.NON_NULL)
    private Mesure outOfPackageDepth;
    @JsonInclude(Include.NON_NULL)
    private Mesure outOfPackageDiameter;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] descriptiveSize;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] consumerSafetyInformation;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] consumerStorageInstructions;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent supplierSpecifiedMinimumConsumerStorageDays;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] consumerUsageInstructions;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] consumerPackageDisclaimer;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode customerSupportCentre;
    @JsonInclude(Include.NON_NULL)
    private ConsumerHandlingStorage consumerHandlingStorage;
    @JsonInclude(Include.NON_NULL)
    private ConsumerHandlingStorage instructionsForUse;
    @JsonInclude(Include.NON_NULL)
    private ConsumerHandlingStorage recipeWebsite;
    @JsonInclude(Include.NON_NULL)
    private ConsumerHandlingStorage audioFile;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] textileMaterialContent;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] seasonName;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent seasonCalendarYear;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] styleDescription;
    @JsonInclude(Include.NON_NULL)
    private String targetConsumerAge;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] clothingCut;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] collarType;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode primaryAlternateProduct;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode replacedProduct;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode replacedByProduct;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isCarbonated;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isDecaffeinated;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isFromConcentrate;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent percentageOfAlcoholByVolume;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] alcoholicBeverageSubregion;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] vintner;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isVintage;
    @JsonInclude(Include.NON_NULL)
    private String beverageVintage;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isPittedStoned;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isSeedless;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isShelledPeeled;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isWashedReadyToEat;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode maturationMethod;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode cheeseFirmness;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode sharpnessOfCheese;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] cheeseMaturationPeriodDescription;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent fatpercentageInDryMatter;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent fatInMilkContent;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isHomogenised;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isRindEdible;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode anatomicalForm;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode bonelessClaim;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] meatPoultryType;
    @JsonInclude(Include.NON_NULL)
    private Mesure minimumMeatPoultryContent;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] catchZone;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] fishType;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode freshOrSeawaterFarmed;
    @JsonInclude(Include.NON_NULL)
    private Mesure minimumFishContent;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] allergenSpecificationAgency;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] allergenSpecificationName;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] allergenStatement;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] ingredientStatement;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] sourceAnimal;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode preservationTechnique;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent juiceContentPercent;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isInstant;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode isSliced;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode foodBeverageTargetUse;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] servingSuggestion;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] servingSizeDescription;
    @JsonInclude(Include.NON_NULL)
    private Mesure servingSize;
    @JsonInclude(Include.NON_NULL)
    private ConvenienceLevelPercent numberOfServingsPerPackage;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode numberOfServingsPerPackageMeasurementPrecision;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] numberOfServingsRangeDescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] countryOfOriginStatement;
    @JsonInclude(Include.NON_NULL)
    private CountryOfOrigin countryOfOrigin;
    @JsonInclude(Include.NON_NULL)
    private CountryOfOrigin countryOfAssembly;
    @JsonInclude(Include.NON_NULL)
    private CountryOfOrigin countryOfLastProcessing;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] provenanceStatement;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] healthClaimDescription;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] nutritionalClaimStatement;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] nutritionalClaim;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] growingMethod;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode irradiatedCode;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode reheatingClaim;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode foodBeverageRefrigerationClaim;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] packagingMarkedLabelAccreditation;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] packagingMarkedFreeFrom;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] packagingMarkedDietAllergenType;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode nutrientBasisQuantityType;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode nutrientMeasurementPrecision;
    @JsonInclude(Include.NON_NULL)
    private Mesure nutrientBasisQuantity;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis fatPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis saturatedFatPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis transFatPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis monounsaturatedFatPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis polyunsaturatedFatPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis cholesterolPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis carbohydratesPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis sugarsPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis polyolsPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis starchPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis saltPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis sodiumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis fibrePerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis proteinPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminAPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminDPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminEPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminKPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminCPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis thiaminPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis riboflavinPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis niacinPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminB6PerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis folicAcidPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis vitaminB12PerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis biotinPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis pantothenicAcidPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis potassiumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis chloridePerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis calciumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis phosphorusPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis magnesiumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis ironPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis zincPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis copperPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis manganesePerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis fluoridePerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis seleniumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis chromiumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis molybdenumPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis iodinePerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis energyPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private NutrientBasis energyFromFatPerNutrientBasis;
    @JsonInclude(Include.NON_NULL)
    private Ingredient ingredient;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] ingredientOfConcern;
    @JsonInclude(Include.NON_NULL)
    private ColourCode colourCode;
    @JsonInclude(Include.NON_NULL)
    private AdditionalProductClassification additionalProductClassification;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] consumerSalesCondition;
    @JsonInclude(Include.NON_NULL)
    private TargetMarket targetMarket;
    @JsonInclude(Include.NON_NULL)
    private SizeCode[] sizeCode;
    @JsonInclude(Include.NON_NULL)
    private Certification certification;
    @JsonInclude(Include.NON_NULL)
    private AwardPrize awardPrize;
    @JsonInclude(Include.NON_NULL)
    private ReferencedFile referencedFile;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] dependentProprietaryProduct;
    @JsonInclude(Include.NON_NULL)
    private SimpleCode[] equivalentProduct;
    @JsonInclude(Include.NON_NULL)
    private OrganicClaim organicClaim;
    @JsonInclude(Include.NON_NULL)
    private Additive additive;
    @JsonInclude(Include.NON_NULL)
    private HasAllergen[] hasAllergen;
    @JsonInclude(Include.NON_NULL)
    private DietCode dietCode;
    @JsonInclude(Include.NON_NULL)
    private LanguageValue[] dietTypeDescription;
    @JsonInclude(Include.NON_NULL)
    private Size size;
    @JsonInclude(Include.NON_NULL)
    private TextileMaterial textileMaterial;
    @JsonInclude(Include.NON_NULL)
    private TextileMaterial upperMaterialType;
    @JsonInclude(Include.NON_NULL)
    private Packaging packaging;
    @JsonInclude(Include.NON_NULL)
    private PackagingMaterial packagingMaterial;
    @JsonInclude(Include.NON_NULL)
    private HasReturnablePackageDeposit hasReturnablePackageDeposit;

    @JsonProperty("@context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("@context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("@type")
    public String[] getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String[] type) {
        this.type = type;
    }

    @JsonProperty("preparationInformation")
    public PreparationInformation getPreparationInformation() {
        return preparationInformation;
    }

    @JsonProperty("preparationInformation")
    public void setPreparationInformation(PreparationInformation preparationInformation) {
        this.preparationInformation = preparationInformation;
    }

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("s:name")
    public LanguageValue[] getSname() {
        return sname;
    }

    @JsonProperty("s:name")
    public void setSname(LanguageValue[] sname) {
        this.sname = sname;
    }

    @JsonProperty("gtin")
    public String getGtin() {
        return gtin;
    }

    @JsonProperty("gtin")
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    @JsonProperty("regulatedProductName")
    public LanguageValue[] getRegulatedProductName() {
        return regulatedProductName;
    }

    @JsonProperty("regulatedProductName")
    public void setRegulatedProductName(LanguageValue[] regulatedProductName) {
        this.regulatedProductName = regulatedProductName;
    }

    @JsonProperty("productRange")
    public LanguageValue[] getProductRange() {
        return productRange;
    }

    @JsonProperty("productRange")
    public void setProductRange(LanguageValue[] productRange) {
        this.productRange = productRange;
    }

    @JsonProperty("s:brand")
    public SimpleCode getSbrand() {
        return sbrand;
    }

    @JsonProperty("s:brand")
    public void setSbrand(SimpleCode sbrand) {
        this.sbrand = sbrand;
    }

    @JsonProperty("s:description")
    public LanguageValue[] getSdescription() {
        return sdescription;
    }

    @JsonProperty("s:description")
    public void setSdescription(LanguageValue[] sdescription) {
        this.sdescription = sdescription;
    }

    @JsonProperty("additionalProductDescription")
    public LanguageValue[] getAdditionalProductDescription() {
        return additionalProductDescription;
    }

    @JsonProperty("additionalProductDescription")
    public void setAdditionalProductDescription(LanguageValue[] additionalProductDescription) {
        this.additionalProductDescription = additionalProductDescription;
    }

    @JsonProperty("productMarketingMessage")
    public LanguageValue[] getProductMarketingMessage() {
        return productMarketingMessage;
    }

    @JsonProperty("productMarketingMessage")
    public void setProductMarketingMessage(LanguageValue[] productMarketingMessage) {
        this.productMarketingMessage = productMarketingMessage;
    }

    @JsonProperty("s:image")
    public Simage getSimage() {
        return simage;
    }

    @JsonProperty("s:image")
    public void setSimage(Simage simage) {
        this.simage = simage;
    }

    @JsonProperty("productFeatureBenefit")
    public LanguageValue[] getProductFeatureBenefit() {
        return productFeatureBenefit;
    }

    @JsonProperty("productFeatureBenefit")
    public void setProductFeatureBenefit(LanguageValue[] productFeatureBenefit) {
        this.productFeatureBenefit = productFeatureBenefit;
    }

    @JsonProperty("productFormDescription")
    public LanguageValue[] getProductFormDescription() {
        return productFormDescription;
    }

    @JsonProperty("productFormDescription")
    public void setProductFormDescription(LanguageValue[] productFormDescription) {
        this.productFormDescription = productFormDescription;
    }

    @JsonProperty("variantDescription")
    public LanguageValue[] getVariantDescription() {
        return variantDescription;
    }

    @JsonProperty("variantDescription")
    public void setVariantDescription(LanguageValue[] variantDescription) {
        this.variantDescription = variantDescription;
    }

    @JsonProperty("productionVariantDescription")
    public LanguageValue[] getProductionVariantDescription() {
        return productionVariantDescription;
    }

    @JsonProperty("productionVariantDescription")
    public void setProductionVariantDescription(LanguageValue[] productionVariantDescription) {
        this.productionVariantDescription = productionVariantDescription;
    }

    @JsonProperty("productionVariantEffectiveDateTime")
    public ConvenienceLevelPercent getProductionVariantEffectiveDateTime() {
        return productionVariantEffectiveDateTime;
    }

    @JsonProperty("productionVariantEffectiveDateTime")
    public void setProductionVariantEffectiveDateTime(ConvenienceLevelPercent productionVariantEffectiveDateTime) {
        this.productionVariantEffectiveDateTime = productionVariantEffectiveDateTime;
    }

    @JsonProperty("s:color")
    public LanguageValue[] getScolor() {
        return scolor;
    }

    @JsonProperty("s:color")
    public void setScolor(LanguageValue[] scolor) {
        this.scolor = scolor;
    }

    @JsonProperty("functionalName")
    public LanguageValue[] getFunctionalName() {
        return functionalName;
    }

    @JsonProperty("functionalName")
    public void setFunctionalName(LanguageValue[] functionalName) {
        this.functionalName = functionalName;
    }

    @JsonProperty("gpcCategoryDescription")
    public LanguageValue[] getGpcCategoryDescription() {
        return gpcCategoryDescription;
    }

    @JsonProperty("gpcCategoryDescription")
    public void setGpcCategoryDescription(LanguageValue[] gpcCategoryDescription) {
        this.gpcCategoryDescription = gpcCategoryDescription;
    }

    @JsonProperty("gpcCategoryCode")
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    @JsonProperty("gpcCategoryCode")
    public void setGpcCategoryCode(String gpcCategoryCode) {
        this.gpcCategoryCode = gpcCategoryCode;
    }

    @JsonProperty("warningCopyDescription")
    public LanguageValue[] getWarningCopyDescription() {
        return warningCopyDescription;
    }

    @JsonProperty("warningCopyDescription")
    public void setWarningCopyDescription(LanguageValue[] warningCopyDescription) {
        this.warningCopyDescription = warningCopyDescription;
    }

    @JsonProperty("includedAccessories")
    public LanguageValue[] getIncludedAccessories() {
        return includedAccessories;
    }

    @JsonProperty("includedAccessories")
    public void setIncludedAccessories(LanguageValue[] includedAccessories) {
        this.includedAccessories = includedAccessories;
    }

    @JsonProperty("s:manufacturer")
    public Organization getSmanufacturer() {
        return smanufacturer;
    }

    @JsonProperty("s:manufacturer")
    public void setSmanufacturer(Organization smanufacturer) {
        this.smanufacturer = smanufacturer;
    }

    @JsonProperty("manufacturingPlant")
    public SimpleCode getManufacturingPlant() {
        return manufacturingPlant;
    }

    @JsonProperty("manufacturingPlant")
    public void setManufacturingPlant(SimpleCode manufacturingPlant) {
        this.manufacturingPlant = manufacturingPlant;
    }

    @JsonProperty("isProductRecalled")
    public ConvenienceLevelPercent getIsProductRecalled() {
        return isProductRecalled;
    }

    @JsonProperty("isProductRecalled")
    public void setIsProductRecalled(ConvenienceLevelPercent isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
    }

    @JsonProperty("manufacturersWarranty")
    public ManufacturersWarranty getManufacturersWarranty() {
        return manufacturersWarranty;
    }

    @JsonProperty("manufacturersWarranty")
    public void setManufacturersWarranty(ManufacturersWarranty manufacturersWarranty) {
        this.manufacturersWarranty = manufacturersWarranty;
    }

    @JsonProperty("s:productID")
    public String getSproductID() {
        return sproductID;
    }

    @JsonProperty("s:productID")
    public void setSproductID(String sproductID) {
        this.sproductID = sproductID;
    }

    @JsonProperty("netWeight")
    public Mesure getNetWeight() {
        return netWeight;
    }

    @JsonProperty("netWeight")
    public void setNetWeight(Mesure netWeight) {
        this.netWeight = netWeight;
    }

    @JsonProperty("grossWeight")
    public Mesure getGrossWeight() {
        return grossWeight;
    }

    @JsonProperty("grossWeight")
    public void setGrossWeight(Mesure grossWeight) {
        this.grossWeight = grossWeight;
    }

    @JsonProperty("drainedWeight")
    public Mesure getDrainedWeight() {
        return drainedWeight;
    }

    @JsonProperty("drainedWeight")
    public void setDrainedWeight(Mesure drainedWeight) {
        this.drainedWeight = drainedWeight;
    }

    @JsonProperty("netContent")
    public Mesure getNetContent() {
        return netContent;
    }

    @JsonProperty("netContent")
    public void setNetContent(Mesure netContent) {
        this.netContent = netContent;
    }

    @JsonProperty("inPackageHeight")
    public Mesure getInPackageHeight() {
        return inPackageHeight;
    }

    @JsonProperty("inPackageHeight")
    public void setInPackageHeight(Mesure inPackageHeight) {
        this.inPackageHeight = inPackageHeight;
    }

    @JsonProperty("inPackageWidth")
    public Mesure getInPackageWidth() {
        return inPackageWidth;
    }

    @JsonProperty("inPackageWidth")
    public void setInPackageWidth(Mesure inPackageWidth) {
        this.inPackageWidth = inPackageWidth;
    }

    @JsonProperty("inPackageDepth")
    public Mesure getInPackageDepth() {
        return inPackageDepth;
    }

    @JsonProperty("inPackageDepth")
    public void setInPackageDepth(Mesure inPackageDepth) {
        this.inPackageDepth = inPackageDepth;
    }

    @JsonProperty("inPackageDiameter")
    public Mesure getInPackageDiameter() {
        return inPackageDiameter;
    }

    @JsonProperty("inPackageDiameter")
    public void setInPackageDiameter(Mesure inPackageDiameter) {
        this.inPackageDiameter = inPackageDiameter;
    }

    @JsonProperty("outOfPackageHeight")
    public Mesure getOutOfPackageHeight() {
        return outOfPackageHeight;
    }

    @JsonProperty("outOfPackageHeight")
    public void setOutOfPackageHeight(Mesure outOfPackageHeight) {
        this.outOfPackageHeight = outOfPackageHeight;
    }

    @JsonProperty("outOfPackageWidth")
    public Mesure getOutOfPackageWidth() {
        return outOfPackageWidth;
    }

    @JsonProperty("outOfPackageWidth")
    public void setOutOfPackageWidth(Mesure outOfPackageWidth) {
        this.outOfPackageWidth = outOfPackageWidth;
    }

    @JsonProperty("outOfPackageDepth")
    public Mesure getOutOfPackageDepth() {
        return outOfPackageDepth;
    }

    @JsonProperty("outOfPackageDepth")
    public void setOutOfPackageDepth(Mesure outOfPackageDepth) {
        this.outOfPackageDepth = outOfPackageDepth;
    }

    @JsonProperty("outOfPackageDiameter")
    public Mesure getOutOfPackageDiameter() {
        return outOfPackageDiameter;
    }

    @JsonProperty("outOfPackageDiameter")
    public void setOutOfPackageDiameter(Mesure outOfPackageDiameter) {
        this.outOfPackageDiameter = outOfPackageDiameter;
    }

    @JsonProperty("descriptiveSize")
    public LanguageValue[] getDescriptiveSize() {
        return descriptiveSize;
    }

    @JsonProperty("descriptiveSize")
    public void setDescriptiveSize(LanguageValue[] descriptiveSize) {
        this.descriptiveSize = descriptiveSize;
    }

    @JsonProperty("consumerSafetyInformation")
    public LanguageValue[] getConsumerSafetyInformation() {
        return consumerSafetyInformation;
    }

    @JsonProperty("consumerSafetyInformation")
    public void setConsumerSafetyInformation(LanguageValue[] consumerSafetyInformation) {
        this.consumerSafetyInformation = consumerSafetyInformation;
    }

    @JsonProperty("consumerStorageInstructions")
    public LanguageValue[] getConsumerStorageInstructions() {
        return consumerStorageInstructions;
    }

    @JsonProperty("consumerStorageInstructions")
    public void setConsumerStorageInstructions(LanguageValue[] consumerStorageInstructions) {
        this.consumerStorageInstructions = consumerStorageInstructions;
    }

    @JsonProperty("supplierSpecifiedMinimumConsumerStorageDays")
    public ConvenienceLevelPercent getSupplierSpecifiedMinimumConsumerStorageDays() {
        return supplierSpecifiedMinimumConsumerStorageDays;
    }

    @JsonProperty("supplierSpecifiedMinimumConsumerStorageDays")
    public void setSupplierSpecifiedMinimumConsumerStorageDays(ConvenienceLevelPercent supplierSpecifiedMinimumConsumerStorageDays) {
        this.supplierSpecifiedMinimumConsumerStorageDays = supplierSpecifiedMinimumConsumerStorageDays;
    }

    @JsonProperty("consumerUsageInstructions")
    public LanguageValue[] getConsumerUsageInstructions() {
        return consumerUsageInstructions;
    }

    @JsonProperty("consumerUsageInstructions")
    public void setConsumerUsageInstructions(LanguageValue[] consumerUsageInstructions) {
        this.consumerUsageInstructions = consumerUsageInstructions;
    }

    @JsonProperty("consumerPackageDisclaimer")
    public LanguageValue[] getConsumerPackageDisclaimer() {
        return consumerPackageDisclaimer;
    }

    @JsonProperty("consumerPackageDisclaimer")
    public void setConsumerPackageDisclaimer(LanguageValue[] consumerPackageDisclaimer) {
        this.consumerPackageDisclaimer = consumerPackageDisclaimer;
    }

    @JsonProperty("customerSupportCentre")
    public SimpleCode getCustomerSupportCentre() {
        return customerSupportCentre;
    }

    @JsonProperty("customerSupportCentre")
    public void setCustomerSupportCentre(SimpleCode customerSupportCentre) {
        this.customerSupportCentre = customerSupportCentre;
    }

    @JsonProperty("consumerHandlingStorage")
    public ConsumerHandlingStorage getConsumerHandlingStorage() {
        return consumerHandlingStorage;
    }

    @JsonProperty("consumerHandlingStorage")
    public void setConsumerHandlingStorage(ConsumerHandlingStorage consumerHandlingStorage) {
        this.consumerHandlingStorage = consumerHandlingStorage;
    }

    @JsonProperty("instructionsForUse")
    public ConsumerHandlingStorage getInstructionsForUse() {
        return instructionsForUse;
    }

    @JsonProperty("instructionsForUse")
    public void setInstructionsForUse(ConsumerHandlingStorage instructionsForUse) {
        this.instructionsForUse = instructionsForUse;
    }

    @JsonProperty("recipeWebsite")
    public ConsumerHandlingStorage getRecipeWebsite() {
        return recipeWebsite;
    }

    @JsonProperty("recipeWebsite")
    public void setRecipeWebsite(ConsumerHandlingStorage recipeWebsite) {
        this.recipeWebsite = recipeWebsite;
    }

    @JsonProperty("audioFile")
    public ConsumerHandlingStorage getAudioFile() {
        return audioFile;
    }

    @JsonProperty("audioFile")
    public void setAudioFile(ConsumerHandlingStorage audioFile) {
        this.audioFile = audioFile;
    }

    @JsonProperty("textileMaterialContent")
    public LanguageValue[] getTextileMaterialContent() {
        return textileMaterialContent;
    }

    @JsonProperty("textileMaterialContent")
    public void setTextileMaterialContent(LanguageValue[] textileMaterialContent) {
        this.textileMaterialContent = textileMaterialContent;
    }

    @JsonProperty("seasonName")
    public LanguageValue[] getSeasonName() {
        return seasonName;
    }

    @JsonProperty("seasonName")
    public void setSeasonName(LanguageValue[] seasonName) {
        this.seasonName = seasonName;
    }

    @JsonProperty("seasonCalendarYear")
    public ConvenienceLevelPercent getSeasonCalendarYear() {
        return seasonCalendarYear;
    }

    @JsonProperty("seasonCalendarYear")
    public void setSeasonCalendarYear(ConvenienceLevelPercent seasonCalendarYear) {
        this.seasonCalendarYear = seasonCalendarYear;
    }

    @JsonProperty("styleDescription")
    public LanguageValue[] getStyleDescription() {
        return styleDescription;
    }

    @JsonProperty("styleDescription")
    public void setStyleDescription(LanguageValue[] styleDescription) {
        this.styleDescription = styleDescription;
    }

    @JsonProperty("targetConsumerAge")
    public String getTargetConsumerAge() {
        return targetConsumerAge;
    }

    @JsonProperty("targetConsumerAge")
    public void setTargetConsumerAge(String targetConsumerAge) {
        this.targetConsumerAge = targetConsumerAge;
    }

    @JsonProperty("clothingCut")
    public LanguageValue[] getClothingCut() {
        return clothingCut;
    }

    @JsonProperty("clothingCut")
    public void setClothingCut(LanguageValue[] clothingCut) {
        this.clothingCut = clothingCut;
    }

    @JsonProperty("collarType")
    public LanguageValue[] getCollarType() {
        return collarType;
    }

    @JsonProperty("collarType")
    public void setCollarType(LanguageValue[] collarType) {
        this.collarType = collarType;
    }

    @JsonProperty("primaryAlternateProduct")
    public SimpleCode getPrimaryAlternateProduct() {
        return primaryAlternateProduct;
    }

    @JsonProperty("primaryAlternateProduct")
    public void setPrimaryAlternateProduct(SimpleCode primaryAlternateProduct) {
        this.primaryAlternateProduct = primaryAlternateProduct;
    }

    @JsonProperty("replacedProduct")
    public SimpleCode getReplacedProduct() {
        return replacedProduct;
    }

    @JsonProperty("replacedProduct")
    public void setReplacedProduct(SimpleCode replacedProduct) {
        this.replacedProduct = replacedProduct;
    }

    @JsonProperty("replacedByProduct")
    public SimpleCode getReplacedByProduct() {
        return replacedByProduct;
    }

    @JsonProperty("replacedByProduct")
    public void setReplacedByProduct(SimpleCode replacedByProduct) {
        this.replacedByProduct = replacedByProduct;
    }

    @JsonProperty("isCarbonated")
    public SimpleCode getIsCarbonated() {
        return isCarbonated;
    }

    @JsonProperty("isCarbonated")
    public void setIsCarbonated(SimpleCode isCarbonated) {
        this.isCarbonated = isCarbonated;
    }

    @JsonProperty("isDecaffeinated")
    public SimpleCode getIsDecaffeinated() {
        return isDecaffeinated;
    }

    @JsonProperty("isDecaffeinated")
    public void setIsDecaffeinated(SimpleCode isDecaffeinated) {
        this.isDecaffeinated = isDecaffeinated;
    }

    @JsonProperty("isFromConcentrate")
    public SimpleCode getIsFromConcentrate() {
        return isFromConcentrate;
    }

    @JsonProperty("isFromConcentrate")
    public void setIsFromConcentrate(SimpleCode isFromConcentrate) {
        this.isFromConcentrate = isFromConcentrate;
    }

    @JsonProperty("percentageOfAlcoholByVolume")
    public ConvenienceLevelPercent getPercentageOfAlcoholByVolume() {
        return percentageOfAlcoholByVolume;
    }

    @JsonProperty("percentageOfAlcoholByVolume")
    public void setPercentageOfAlcoholByVolume(ConvenienceLevelPercent percentageOfAlcoholByVolume) {
        this.percentageOfAlcoholByVolume = percentageOfAlcoholByVolume;
    }

    @JsonProperty("alcoholicBeverageSubregion")
    public LanguageValue[] getAlcoholicBeverageSubregion() {
        return alcoholicBeverageSubregion;
    }

    @JsonProperty("alcoholicBeverageSubregion")
    public void setAlcoholicBeverageSubregion(LanguageValue[] alcoholicBeverageSubregion) {
        this.alcoholicBeverageSubregion = alcoholicBeverageSubregion;
    }

    @JsonProperty("vintner")
    public LanguageValue[] getVintner() {
        return vintner;
    }

    @JsonProperty("vintner")
    public void setVintner(LanguageValue[] vintner) {
        this.vintner = vintner;
    }

    @JsonProperty("isVintage")
    public SimpleCode getIsVintage() {
        return isVintage;
    }

    @JsonProperty("isVintage")
    public void setIsVintage(SimpleCode isVintage) {
        this.isVintage = isVintage;
    }

    @JsonProperty("beverageVintage")
    public String getBeverageVintage() {
        return beverageVintage;
    }

    @JsonProperty("beverageVintage")
    public void setBeverageVintage(String beverageVintage) {
        this.beverageVintage = beverageVintage;
    }

    @JsonProperty("isPittedStoned")
    public SimpleCode getIsPittedStoned() {
        return isPittedStoned;
    }

    @JsonProperty("isPittedStoned")
    public void setIsPittedStoned(SimpleCode isPittedStoned) {
        this.isPittedStoned = isPittedStoned;
    }

    @JsonProperty("isSeedless")
    public SimpleCode getIsSeedless() {
        return isSeedless;
    }

    @JsonProperty("isSeedless")
    public void setIsSeedless(SimpleCode isSeedless) {
        this.isSeedless = isSeedless;
    }

    @JsonProperty("isShelledPeeled")
    public SimpleCode getIsShelledPeeled() {
        return isShelledPeeled;
    }

    @JsonProperty("isShelledPeeled")
    public void setIsShelledPeeled(SimpleCode isShelledPeeled) {
        this.isShelledPeeled = isShelledPeeled;
    }

    @JsonProperty("isWashedReadyToEat")
    public SimpleCode getIsWashedReadyToEat() {
        return isWashedReadyToEat;
    }

    @JsonProperty("isWashedReadyToEat")
    public void setIsWashedReadyToEat(SimpleCode isWashedReadyToEat) {
        this.isWashedReadyToEat = isWashedReadyToEat;
    }

    @JsonProperty("maturationMethod")
    public SimpleCode getMaturationMethod() {
        return maturationMethod;
    }

    @JsonProperty("maturationMethod")
    public void setMaturationMethod(SimpleCode maturationMethod) {
        this.maturationMethod = maturationMethod;
    }

    @JsonProperty("cheeseFirmness")
    public SimpleCode getCheeseFirmness() {
        return cheeseFirmness;
    }

    @JsonProperty("cheeseFirmness")
    public void setCheeseFirmness(SimpleCode cheeseFirmness) {
        this.cheeseFirmness = cheeseFirmness;
    }

    @JsonProperty("sharpnessOfCheese")
    public SimpleCode getSharpnessOfCheese() {
        return sharpnessOfCheese;
    }

    @JsonProperty("sharpnessOfCheese")
    public void setSharpnessOfCheese(SimpleCode sharpnessOfCheese) {
        this.sharpnessOfCheese = sharpnessOfCheese;
    }

    @JsonProperty("cheeseMaturationPeriodDescription")
    public LanguageValue[] getCheeseMaturationPeriodDescription() {
        return cheeseMaturationPeriodDescription;
    }

    @JsonProperty("cheeseMaturationPeriodDescription")
    public void setCheeseMaturationPeriodDescription(LanguageValue[] cheeseMaturationPeriodDescription) {
        this.cheeseMaturationPeriodDescription = cheeseMaturationPeriodDescription;
    }

    @JsonProperty("fatpercentageInDryMatter")
    public ConvenienceLevelPercent getFatpercentageInDryMatter() {
        return fatpercentageInDryMatter;
    }

    @JsonProperty("fatpercentageInDryMatter")
    public void setFatpercentageInDryMatter(ConvenienceLevelPercent fatpercentageInDryMatter) {
        this.fatpercentageInDryMatter = fatpercentageInDryMatter;
    }

    @JsonProperty("fatInMilkContent")
    public ConvenienceLevelPercent getFatInMilkContent() {
        return fatInMilkContent;
    }

    @JsonProperty("fatInMilkContent")
    public void setFatInMilkContent(ConvenienceLevelPercent fatInMilkContent) {
        this.fatInMilkContent = fatInMilkContent;
    }

    @JsonProperty("isHomogenised")
    public SimpleCode getIsHomogenised() {
        return isHomogenised;
    }

    @JsonProperty("isHomogenised")
    public void setIsHomogenised(SimpleCode isHomogenised) {
        this.isHomogenised = isHomogenised;
    }

    @JsonProperty("isRindEdible")
    public SimpleCode getIsRindEdible() {
        return isRindEdible;
    }

    @JsonProperty("isRindEdible")
    public void setIsRindEdible(SimpleCode isRindEdible) {
        this.isRindEdible = isRindEdible;
    }

    @JsonProperty("anatomicalForm")
    public SimpleCode getAnatomicalForm() {
        return anatomicalForm;
    }

    @JsonProperty("anatomicalForm")
    public void setAnatomicalForm(SimpleCode anatomicalForm) {
        this.anatomicalForm = anatomicalForm;
    }

    @JsonProperty("bonelessClaim")
    public SimpleCode getBonelessClaim() {
        return bonelessClaim;
    }

    @JsonProperty("bonelessClaim")
    public void setBonelessClaim(SimpleCode bonelessClaim) {
        this.bonelessClaim = bonelessClaim;
    }

    @JsonProperty("meatPoultryType")
    public LanguageValue[] getMeatPoultryType() {
        return meatPoultryType;
    }

    @JsonProperty("meatPoultryType")
    public void setMeatPoultryType(LanguageValue[] meatPoultryType) {
        this.meatPoultryType = meatPoultryType;
    }

    @JsonProperty("minimumMeatPoultryContent")
    public Mesure getMinimumMeatPoultryContent() {
        return minimumMeatPoultryContent;
    }

    @JsonProperty("minimumMeatPoultryContent")
    public void setMinimumMeatPoultryContent(Mesure minimumMeatPoultryContent) {
        this.minimumMeatPoultryContent = minimumMeatPoultryContent;
    }

    @JsonProperty("catchZone")
    public LanguageValue[] getCatchZone() {
        return catchZone;
    }

    @JsonProperty("catchZone")
    public void setCatchZone(LanguageValue[] catchZone) {
        this.catchZone = catchZone;
    }

    @JsonProperty("fishType")
    public LanguageValue[] getFishType() {
        return fishType;
    }

    @JsonProperty("fishType")
    public void setFishType(LanguageValue[] fishType) {
        this.fishType = fishType;
    }

    @JsonProperty("freshOrSeawaterFarmed")
    public SimpleCode getFreshOrSeawaterFarmed() {
        return freshOrSeawaterFarmed;
    }

    @JsonProperty("freshOrSeawaterFarmed")
    public void setFreshOrSeawaterFarmed(SimpleCode freshOrSeawaterFarmed) {
        this.freshOrSeawaterFarmed = freshOrSeawaterFarmed;
    }

    @JsonProperty("minimumFishContent")
    public Mesure getMinimumFishContent() {
        return minimumFishContent;
    }

    @JsonProperty("minimumFishContent")
    public void setMinimumFishContent(Mesure minimumFishContent) {
        this.minimumFishContent = minimumFishContent;
    }

    @JsonProperty("allergenSpecificationAgency")
    public LanguageValue[] getAllergenSpecificationAgency() {
        return allergenSpecificationAgency;
    }

    @JsonProperty("allergenSpecificationAgency")
    public void setAllergenSpecificationAgency(LanguageValue[] allergenSpecificationAgency) {
        this.allergenSpecificationAgency = allergenSpecificationAgency;
    }

    @JsonProperty("allergenSpecificationName")
    public LanguageValue[] getAllergenSpecificationName() {
        return allergenSpecificationName;
    }

    @JsonProperty("allergenSpecificationName")
    public void setAllergenSpecificationName(LanguageValue[] allergenSpecificationName) {
        this.allergenSpecificationName = allergenSpecificationName;
    }

    @JsonProperty("allergenStatement")
    public LanguageValue[] getAllergenStatement() {
        return allergenStatement;
    }

    @JsonProperty("allergenStatement")
    public void setAllergenStatement(LanguageValue[] allergenStatement) {
        this.allergenStatement = allergenStatement;
    }

    @JsonProperty("ingredientStatement")
    public LanguageValue[] getIngredientStatement() {
        return ingredientStatement;
    }

    @JsonProperty("ingredientStatement")
    public void setIngredientStatement(LanguageValue[] ingredientStatement) {
        this.ingredientStatement = ingredientStatement;
    }

    @JsonProperty("sourceAnimal")
    public SimpleCode[] getSourceAnimal() {
        return sourceAnimal;
    }

    @JsonProperty("sourceAnimal")
    public void setSourceAnimal(SimpleCode[] sourceAnimal) {
        this.sourceAnimal = sourceAnimal;
    }

    @JsonProperty("preservationTechnique")
    public SimpleCode getPreservationTechnique() {
        return preservationTechnique;
    }

    @JsonProperty("preservationTechnique")
    public void setPreservationTechnique(SimpleCode preservationTechnique) {
        this.preservationTechnique = preservationTechnique;
    }

    @JsonProperty("juiceContentPercent")
    public ConvenienceLevelPercent getJuiceContentPercent() {
        return juiceContentPercent;
    }

    @JsonProperty("juiceContentPercent")
    public void setJuiceContentPercent(ConvenienceLevelPercent juiceContentPercent) {
        this.juiceContentPercent = juiceContentPercent;
    }

    @JsonProperty("isInstant")
    public SimpleCode getIsInstant() {
        return isInstant;
    }

    @JsonProperty("isInstant")
    public void setIsInstant(SimpleCode isInstant) {
        this.isInstant = isInstant;
    }

    @JsonProperty("isSliced")
    public SimpleCode getIsSliced() {
        return isSliced;
    }

    @JsonProperty("isSliced")
    public void setIsSliced(SimpleCode isSliced) {
        this.isSliced = isSliced;
    }

    @JsonProperty("foodBeverageTargetUse")
    public SimpleCode getFoodBeverageTargetUse() {
        return foodBeverageTargetUse;
    }

    @JsonProperty("foodBeverageTargetUse")
    public void setFoodBeverageTargetUse(SimpleCode foodBeverageTargetUse) {
        this.foodBeverageTargetUse = foodBeverageTargetUse;
    }

    @JsonProperty("servingSuggestion")
    public LanguageValue[] getServingSuggestion() {
        return servingSuggestion;
    }

    @JsonProperty("servingSuggestion")
    public void setServingSuggestion(LanguageValue[] servingSuggestion) {
        this.servingSuggestion = servingSuggestion;
    }

    @JsonProperty("servingSizeDescription")
    public LanguageValue[] getServingSizeDescription() {
        return servingSizeDescription;
    }

    @JsonProperty("servingSizeDescription")
    public void setServingSizeDescription(LanguageValue[] servingSizeDescription) {
        this.servingSizeDescription = servingSizeDescription;
    }

    @JsonProperty("servingSize")
    public Mesure getServingSize() {
        return servingSize;
    }

    @JsonProperty("servingSize")
    public void setServingSize(Mesure servingSize) {
        this.servingSize = servingSize;
    }

    @JsonProperty("numberOfServingsPerPackage")
    public ConvenienceLevelPercent getNumberOfServingsPerPackage() {
        return numberOfServingsPerPackage;
    }

    @JsonProperty("numberOfServingsPerPackage")
    public void setNumberOfServingsPerPackage(ConvenienceLevelPercent numberOfServingsPerPackage) {
        this.numberOfServingsPerPackage = numberOfServingsPerPackage;
    }

    @JsonProperty("numberOfServingsPerPackageMeasurementPrecision")
    public SimpleCode getNumberOfServingsPerPackageMeasurementPrecision() {
        return numberOfServingsPerPackageMeasurementPrecision;
    }

    @JsonProperty("numberOfServingsPerPackageMeasurementPrecision")
    public void setNumberOfServingsPerPackageMeasurementPrecision(SimpleCode numberOfServingsPerPackageMeasurementPrecision) {
        this.numberOfServingsPerPackageMeasurementPrecision = numberOfServingsPerPackageMeasurementPrecision;
    }

    @JsonProperty("numberOfServingsRangeDescription")
    public LanguageValue[] getNumberOfServingsRangeDescription() {
        return numberOfServingsRangeDescription;
    }

    @JsonProperty("numberOfServingsRangeDescription")
    public void setNumberOfServingsRangeDescription(LanguageValue[] numberOfServingsRangeDescription) {
        this.numberOfServingsRangeDescription = numberOfServingsRangeDescription;
    }

    @JsonProperty("countryOfOriginStatement")
    public LanguageValue[] getCountryOfOriginStatement() {
        return countryOfOriginStatement;
    }

    @JsonProperty("countryOfOriginStatement")
    public void setCountryOfOriginStatement(LanguageValue[] countryOfOriginStatement) {
        this.countryOfOriginStatement = countryOfOriginStatement;
    }

    @JsonProperty("countryOfOrigin")
    public CountryOfOrigin getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(CountryOfOrigin countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @JsonProperty("countryOfAssembly")
    public CountryOfOrigin getCountryOfAssembly() {
        return countryOfAssembly;
    }

    @JsonProperty("countryOfAssembly")
    public void setCountryOfAssembly(CountryOfOrigin countryOfAssembly) {
        this.countryOfAssembly = countryOfAssembly;
    }

    @JsonProperty("countryOfLastProcessing")
    public CountryOfOrigin getCountryOfLastProcessing() {
        return countryOfLastProcessing;
    }

    @JsonProperty("countryOfLastProcessing")
    public void setCountryOfLastProcessing(CountryOfOrigin countryOfLastProcessing) {
        this.countryOfLastProcessing = countryOfLastProcessing;
    }

    @JsonProperty("provenanceStatement")
    public LanguageValue[] getProvenanceStatement() {
        return provenanceStatement;
    }

    @JsonProperty("provenanceStatement")
    public void setProvenanceStatement(LanguageValue[] provenanceStatement) {
        this.provenanceStatement = provenanceStatement;
    }

    @JsonProperty("healthClaimDescription")
    public LanguageValue[] getHealthClaimDescription() {
        return healthClaimDescription;
    }

    @JsonProperty("healthClaimDescription")
    public void setHealthClaimDescription(LanguageValue[] healthClaimDescription) {
        this.healthClaimDescription = healthClaimDescription;
    }

    @JsonProperty("nutritionalClaimStatement")
    public LanguageValue[] getNutritionalClaimStatement() {
        return nutritionalClaimStatement;
    }

    @JsonProperty("nutritionalClaimStatement")
    public void setNutritionalClaimStatement(LanguageValue[] nutritionalClaimStatement) {
        this.nutritionalClaimStatement = nutritionalClaimStatement;
    }

    @JsonProperty("nutritionalClaim")
    public SimpleCode[] getNutritionalClaim() {
        return nutritionalClaim;
    }

    @JsonProperty("nutritionalClaim")
    public void setNutritionalClaim(SimpleCode[] nutritionalClaim) {
        this.nutritionalClaim = nutritionalClaim;
    }

    @JsonProperty("growingMethod")
    public SimpleCode[] getGrowingMethod() {
        return growingMethod;
    }

    @JsonProperty("growingMethod")
    public void setGrowingMethod(SimpleCode[] growingMethod) {
        this.growingMethod = growingMethod;
    }

    @JsonProperty("irradiatedCode")
    public SimpleCode getIrradiatedCode() {
        return irradiatedCode;
    }

    @JsonProperty("irradiatedCode")
    public void setIrradiatedCode(SimpleCode irradiatedCode) {
        this.irradiatedCode = irradiatedCode;
    }

    @JsonProperty("reheatingClaim")
    public SimpleCode getReheatingClaim() {
        return reheatingClaim;
    }

    @JsonProperty("reheatingClaim")
    public void setReheatingClaim(SimpleCode reheatingClaim) {
        this.reheatingClaim = reheatingClaim;
    }

    @JsonProperty("foodBeverageRefrigerationClaim")
    public SimpleCode getFoodBeverageRefrigerationClaim() {
        return foodBeverageRefrigerationClaim;
    }

    @JsonProperty("foodBeverageRefrigerationClaim")
    public void setFoodBeverageRefrigerationClaim(SimpleCode foodBeverageRefrigerationClaim) {
        this.foodBeverageRefrigerationClaim = foodBeverageRefrigerationClaim;
    }

    @JsonProperty("packagingMarkedLabelAccreditation")
    public SimpleCode[] getPackagingMarkedLabelAccreditation() {
        return packagingMarkedLabelAccreditation;
    }

    @JsonProperty("packagingMarkedLabelAccreditation")
    public void setPackagingMarkedLabelAccreditation(SimpleCode[] packagingMarkedLabelAccreditation) {
        this.packagingMarkedLabelAccreditation = packagingMarkedLabelAccreditation;
    }

    @JsonProperty("packagingMarkedFreeFrom")
    public SimpleCode[] getPackagingMarkedFreeFrom() {
        return packagingMarkedFreeFrom;
    }

    @JsonProperty("packagingMarkedFreeFrom")
    public void setPackagingMarkedFreeFrom(SimpleCode[] packagingMarkedFreeFrom) {
        this.packagingMarkedFreeFrom = packagingMarkedFreeFrom;
    }

    @JsonProperty("packagingMarkedDietAllergenType")
    public SimpleCode[] getPackagingMarkedDietAllergenType() {
        return packagingMarkedDietAllergenType;
    }

    @JsonProperty("packagingMarkedDietAllergenType")
    public void setPackagingMarkedDietAllergenType(SimpleCode[] packagingMarkedDietAllergenType) {
        this.packagingMarkedDietAllergenType = packagingMarkedDietAllergenType;
    }

    @JsonProperty("nutrientBasisQuantityType")
    public SimpleCode getNutrientBasisQuantityType() {
        return nutrientBasisQuantityType;
    }

    @JsonProperty("nutrientBasisQuantityType")
    public void setNutrientBasisQuantityType(SimpleCode nutrientBasisQuantityType) {
        this.nutrientBasisQuantityType = nutrientBasisQuantityType;
    }

    @JsonProperty("nutrientMeasurementPrecision")
    public SimpleCode getNutrientMeasurementPrecision() {
        return nutrientMeasurementPrecision;
    }

    @JsonProperty("nutrientMeasurementPrecision")
    public void setNutrientMeasurementPrecision(SimpleCode nutrientMeasurementPrecision) {
        this.nutrientMeasurementPrecision = nutrientMeasurementPrecision;
    }

    @JsonProperty("nutrientBasisQuantity")
    public Mesure getNutrientBasisQuantity() {
        return nutrientBasisQuantity;
    }

    @JsonProperty("nutrientBasisQuantity")
    public void setNutrientBasisQuantity(Mesure nutrientBasisQuantity) {
        this.nutrientBasisQuantity = nutrientBasisQuantity;
    }

    @JsonProperty("fatPerNutrientBasis")
    public NutrientBasis getFatPerNutrientBasis() {
        return fatPerNutrientBasis;
    }

    @JsonProperty("fatPerNutrientBasis")
    public void setFatPerNutrientBasis(NutrientBasis fatPerNutrientBasis) {
        this.fatPerNutrientBasis = fatPerNutrientBasis;
    }

    @JsonProperty("saturatedFatPerNutrientBasis")
    public NutrientBasis getSaturatedFatPerNutrientBasis() {
        return saturatedFatPerNutrientBasis;
    }

    @JsonProperty("saturatedFatPerNutrientBasis")
    public void setSaturatedFatPerNutrientBasis(NutrientBasis saturatedFatPerNutrientBasis) {
        this.saturatedFatPerNutrientBasis = saturatedFatPerNutrientBasis;
    }

    @JsonProperty("transFatPerNutrientBasis")
    public NutrientBasis getTransFatPerNutrientBasis() {
        return transFatPerNutrientBasis;
    }

    @JsonProperty("transFatPerNutrientBasis")
    public void setTransFatPerNutrientBasis(NutrientBasis transFatPerNutrientBasis) {
        this.transFatPerNutrientBasis = transFatPerNutrientBasis;
    }

    @JsonProperty("monounsaturatedFatPerNutrientBasis")
    public NutrientBasis getMonounsaturatedFatPerNutrientBasis() {
        return monounsaturatedFatPerNutrientBasis;
    }

    @JsonProperty("monounsaturatedFatPerNutrientBasis")
    public void setMonounsaturatedFatPerNutrientBasis(NutrientBasis monounsaturatedFatPerNutrientBasis) {
        this.monounsaturatedFatPerNutrientBasis = monounsaturatedFatPerNutrientBasis;
    }

    @JsonProperty("polyunsaturatedFatPerNutrientBasis")
    public NutrientBasis getPolyunsaturatedFatPerNutrientBasis() {
        return polyunsaturatedFatPerNutrientBasis;
    }

    @JsonProperty("polyunsaturatedFatPerNutrientBasis")
    public void setPolyunsaturatedFatPerNutrientBasis(NutrientBasis polyunsaturatedFatPerNutrientBasis) {
        this.polyunsaturatedFatPerNutrientBasis = polyunsaturatedFatPerNutrientBasis;
    }

    @JsonProperty("cholesterolPerNutrientBasis")
    public NutrientBasis getCholesterolPerNutrientBasis() {
        return cholesterolPerNutrientBasis;
    }

    @JsonProperty("cholesterolPerNutrientBasis")
    public void setCholesterolPerNutrientBasis(NutrientBasis cholesterolPerNutrientBasis) {
        this.cholesterolPerNutrientBasis = cholesterolPerNutrientBasis;
    }

    @JsonProperty("carbohydratesPerNutrientBasis")
    public NutrientBasis getCarbohydratesPerNutrientBasis() {
        return carbohydratesPerNutrientBasis;
    }

    @JsonProperty("carbohydratesPerNutrientBasis")
    public void setCarbohydratesPerNutrientBasis(NutrientBasis carbohydratesPerNutrientBasis) {
        this.carbohydratesPerNutrientBasis = carbohydratesPerNutrientBasis;
    }

    @JsonProperty("sugarsPerNutrientBasis")
    public NutrientBasis getSugarsPerNutrientBasis() {
        return sugarsPerNutrientBasis;
    }

    @JsonProperty("sugarsPerNutrientBasis")
    public void setSugarsPerNutrientBasis(NutrientBasis sugarsPerNutrientBasis) {
        this.sugarsPerNutrientBasis = sugarsPerNutrientBasis;
    }

    @JsonProperty("polyolsPerNutrientBasis")
    public NutrientBasis getPolyolsPerNutrientBasis() {
        return polyolsPerNutrientBasis;
    }

    @JsonProperty("polyolsPerNutrientBasis")
    public void setPolyolsPerNutrientBasis(NutrientBasis polyolsPerNutrientBasis) {
        this.polyolsPerNutrientBasis = polyolsPerNutrientBasis;
    }

    @JsonProperty("starchPerNutrientBasis")
    public NutrientBasis getStarchPerNutrientBasis() {
        return starchPerNutrientBasis;
    }

    @JsonProperty("starchPerNutrientBasis")
    public void setStarchPerNutrientBasis(NutrientBasis starchPerNutrientBasis) {
        this.starchPerNutrientBasis = starchPerNutrientBasis;
    }

    @JsonProperty("saltPerNutrientBasis")
    public NutrientBasis getSaltPerNutrientBasis() {
        return saltPerNutrientBasis;
    }

    @JsonProperty("saltPerNutrientBasis")
    public void setSaltPerNutrientBasis(NutrientBasis saltPerNutrientBasis) {
        this.saltPerNutrientBasis = saltPerNutrientBasis;
    }

    @JsonProperty("sodiumPerNutrientBasis")
    public NutrientBasis getSodiumPerNutrientBasis() {
        return sodiumPerNutrientBasis;
    }

    @JsonProperty("sodiumPerNutrientBasis")
    public void setSodiumPerNutrientBasis(NutrientBasis sodiumPerNutrientBasis) {
        this.sodiumPerNutrientBasis = sodiumPerNutrientBasis;
    }

    @JsonProperty("fibrePerNutrientBasis")
    public NutrientBasis getFibrePerNutrientBasis() {
        return fibrePerNutrientBasis;
    }

    @JsonProperty("fibrePerNutrientBasis")
    public void setFibrePerNutrientBasis(NutrientBasis fibrePerNutrientBasis) {
        this.fibrePerNutrientBasis = fibrePerNutrientBasis;
    }

    @JsonProperty("proteinPerNutrientBasis")
    public NutrientBasis getProteinPerNutrientBasis() {
        return proteinPerNutrientBasis;
    }

    @JsonProperty("proteinPerNutrientBasis")
    public void setProteinPerNutrientBasis(NutrientBasis proteinPerNutrientBasis) {
        this.proteinPerNutrientBasis = proteinPerNutrientBasis;
    }

    @JsonProperty("vitaminAPerNutrientBasis")
    public NutrientBasis getVitaminAPerNutrientBasis() {
        return vitaminAPerNutrientBasis;
    }

    @JsonProperty("vitaminAPerNutrientBasis")
    public void setVitaminAPerNutrientBasis(NutrientBasis vitaminAPerNutrientBasis) {
        this.vitaminAPerNutrientBasis = vitaminAPerNutrientBasis;
    }

    @JsonProperty("vitaminDPerNutrientBasis")
    public NutrientBasis getVitaminDPerNutrientBasis() {
        return vitaminDPerNutrientBasis;
    }

    @JsonProperty("vitaminDPerNutrientBasis")
    public void setVitaminDPerNutrientBasis(NutrientBasis vitaminDPerNutrientBasis) {
        this.vitaminDPerNutrientBasis = vitaminDPerNutrientBasis;
    }

    @JsonProperty("vitaminEPerNutrientBasis")
    public NutrientBasis getVitaminEPerNutrientBasis() {
        return vitaminEPerNutrientBasis;
    }

    @JsonProperty("vitaminEPerNutrientBasis")
    public void setVitaminEPerNutrientBasis(NutrientBasis vitaminEPerNutrientBasis) {
        this.vitaminEPerNutrientBasis = vitaminEPerNutrientBasis;
    }

    @JsonProperty("vitaminKPerNutrientBasis")
    public NutrientBasis getVitaminKPerNutrientBasis() {
        return vitaminKPerNutrientBasis;
    }

    @JsonProperty("vitaminKPerNutrientBasis")
    public void setVitaminKPerNutrientBasis(NutrientBasis vitaminKPerNutrientBasis) {
        this.vitaminKPerNutrientBasis = vitaminKPerNutrientBasis;
    }

    @JsonProperty("vitaminCPerNutrientBasis")
    public NutrientBasis getVitaminCPerNutrientBasis() {
        return vitaminCPerNutrientBasis;
    }

    @JsonProperty("vitaminCPerNutrientBasis")
    public void setVitaminCPerNutrientBasis(NutrientBasis vitaminCPerNutrientBasis) {
        this.vitaminCPerNutrientBasis = vitaminCPerNutrientBasis;
    }

    @JsonProperty("thiaminPerNutrientBasis")
    public NutrientBasis getThiaminPerNutrientBasis() {
        return thiaminPerNutrientBasis;
    }

    @JsonProperty("thiaminPerNutrientBasis")
    public void setThiaminPerNutrientBasis(NutrientBasis thiaminPerNutrientBasis) {
        this.thiaminPerNutrientBasis = thiaminPerNutrientBasis;
    }

    @JsonProperty("riboflavinPerNutrientBasis")
    public NutrientBasis getRiboflavinPerNutrientBasis() {
        return riboflavinPerNutrientBasis;
    }

    @JsonProperty("riboflavinPerNutrientBasis")
    public void setRiboflavinPerNutrientBasis(NutrientBasis riboflavinPerNutrientBasis) {
        this.riboflavinPerNutrientBasis = riboflavinPerNutrientBasis;
    }

    @JsonProperty("niacinPerNutrientBasis")
    public NutrientBasis getNiacinPerNutrientBasis() {
        return niacinPerNutrientBasis;
    }

    @JsonProperty("niacinPerNutrientBasis")
    public void setNiacinPerNutrientBasis(NutrientBasis niacinPerNutrientBasis) {
        this.niacinPerNutrientBasis = niacinPerNutrientBasis;
    }

    @JsonProperty("vitaminB6PerNutrientBasis")
    public NutrientBasis getVitaminB6PerNutrientBasis() {
        return vitaminB6PerNutrientBasis;
    }

    @JsonProperty("vitaminB6PerNutrientBasis")
    public void setVitaminB6PerNutrientBasis(NutrientBasis vitaminB6PerNutrientBasis) {
        this.vitaminB6PerNutrientBasis = vitaminB6PerNutrientBasis;
    }

    @JsonProperty("folicAcidPerNutrientBasis")
    public NutrientBasis getFolicAcidPerNutrientBasis() {
        return folicAcidPerNutrientBasis;
    }

    @JsonProperty("folicAcidPerNutrientBasis")
    public void setFolicAcidPerNutrientBasis(NutrientBasis folicAcidPerNutrientBasis) {
        this.folicAcidPerNutrientBasis = folicAcidPerNutrientBasis;
    }

    @JsonProperty("vitaminB12PerNutrientBasis")
    public NutrientBasis getVitaminB12PerNutrientBasis() {
        return vitaminB12PerNutrientBasis;
    }

    @JsonProperty("vitaminB12PerNutrientBasis")
    public void setVitaminB12PerNutrientBasis(NutrientBasis vitaminB12PerNutrientBasis) {
        this.vitaminB12PerNutrientBasis = vitaminB12PerNutrientBasis;
    }

    @JsonProperty("biotinPerNutrientBasis")
    public NutrientBasis getBiotinPerNutrientBasis() {
        return biotinPerNutrientBasis;
    }

    @JsonProperty("biotinPerNutrientBasis")
    public void setBiotinPerNutrientBasis(NutrientBasis biotinPerNutrientBasis) {
        this.biotinPerNutrientBasis = biotinPerNutrientBasis;
    }

    @JsonProperty("pantothenicAcidPerNutrientBasis")
    public NutrientBasis getPantothenicAcidPerNutrientBasis() {
        return pantothenicAcidPerNutrientBasis;
    }

    @JsonProperty("pantothenicAcidPerNutrientBasis")
    public void setPantothenicAcidPerNutrientBasis(NutrientBasis pantothenicAcidPerNutrientBasis) {
        this.pantothenicAcidPerNutrientBasis = pantothenicAcidPerNutrientBasis;
    }

    @JsonProperty("potassiumPerNutrientBasis")
    public NutrientBasis getPotassiumPerNutrientBasis() {
        return potassiumPerNutrientBasis;
    }

    @JsonProperty("potassiumPerNutrientBasis")
    public void setPotassiumPerNutrientBasis(NutrientBasis potassiumPerNutrientBasis) {
        this.potassiumPerNutrientBasis = potassiumPerNutrientBasis;
    }

    @JsonProperty("chloridePerNutrientBasis")
    public NutrientBasis getChloridePerNutrientBasis() {
        return chloridePerNutrientBasis;
    }

    @JsonProperty("chloridePerNutrientBasis")
    public void setChloridePerNutrientBasis(NutrientBasis chloridePerNutrientBasis) {
        this.chloridePerNutrientBasis = chloridePerNutrientBasis;
    }

    @JsonProperty("calciumPerNutrientBasis")
    public NutrientBasis getCalciumPerNutrientBasis() {
        return calciumPerNutrientBasis;
    }

    @JsonProperty("calciumPerNutrientBasis")
    public void setCalciumPerNutrientBasis(NutrientBasis calciumPerNutrientBasis) {
        this.calciumPerNutrientBasis = calciumPerNutrientBasis;
    }

    @JsonProperty("phosphorusPerNutrientBasis")
    public NutrientBasis getPhosphorusPerNutrientBasis() {
        return phosphorusPerNutrientBasis;
    }

    @JsonProperty("phosphorusPerNutrientBasis")
    public void setPhosphorusPerNutrientBasis(NutrientBasis phosphorusPerNutrientBasis) {
        this.phosphorusPerNutrientBasis = phosphorusPerNutrientBasis;
    }

    @JsonProperty("magnesiumPerNutrientBasis")
    public NutrientBasis getMagnesiumPerNutrientBasis() {
        return magnesiumPerNutrientBasis;
    }

    @JsonProperty("magnesiumPerNutrientBasis")
    public void setMagnesiumPerNutrientBasis(NutrientBasis magnesiumPerNutrientBasis) {
        this.magnesiumPerNutrientBasis = magnesiumPerNutrientBasis;
    }

    @JsonProperty("ironPerNutrientBasis")
    public NutrientBasis getIronPerNutrientBasis() {
        return ironPerNutrientBasis;
    }

    @JsonProperty("ironPerNutrientBasis")
    public void setIronPerNutrientBasis(NutrientBasis ironPerNutrientBasis) {
        this.ironPerNutrientBasis = ironPerNutrientBasis;
    }

    @JsonProperty("zincPerNutrientBasis")
    public NutrientBasis getZincPerNutrientBasis() {
        return zincPerNutrientBasis;
    }

    @JsonProperty("zincPerNutrientBasis")
    public void setZincPerNutrientBasis(NutrientBasis zincPerNutrientBasis) {
        this.zincPerNutrientBasis = zincPerNutrientBasis;
    }

    @JsonProperty("copperPerNutrientBasis")
    public NutrientBasis getCopperPerNutrientBasis() {
        return copperPerNutrientBasis;
    }

    @JsonProperty("copperPerNutrientBasis")
    public void setCopperPerNutrientBasis(NutrientBasis copperPerNutrientBasis) {
        this.copperPerNutrientBasis = copperPerNutrientBasis;
    }

    @JsonProperty("manganesePerNutrientBasis")
    public NutrientBasis getManganesePerNutrientBasis() {
        return manganesePerNutrientBasis;
    }

    @JsonProperty("manganesePerNutrientBasis")
    public void setManganesePerNutrientBasis(NutrientBasis manganesePerNutrientBasis) {
        this.manganesePerNutrientBasis = manganesePerNutrientBasis;
    }

    @JsonProperty("fluoridePerNutrientBasis")
    public NutrientBasis getFluoridePerNutrientBasis() {
        return fluoridePerNutrientBasis;
    }

    @JsonProperty("fluoridePerNutrientBasis")
    public void setFluoridePerNutrientBasis(NutrientBasis fluoridePerNutrientBasis) {
        this.fluoridePerNutrientBasis = fluoridePerNutrientBasis;
    }

    @JsonProperty("seleniumPerNutrientBasis")
    public NutrientBasis getSeleniumPerNutrientBasis() {
        return seleniumPerNutrientBasis;
    }

    @JsonProperty("seleniumPerNutrientBasis")
    public void setSeleniumPerNutrientBasis(NutrientBasis seleniumPerNutrientBasis) {
        this.seleniumPerNutrientBasis = seleniumPerNutrientBasis;
    }

    @JsonProperty("chromiumPerNutrientBasis")
    public NutrientBasis getChromiumPerNutrientBasis() {
        return chromiumPerNutrientBasis;
    }

    @JsonProperty("chromiumPerNutrientBasis")
    public void setChromiumPerNutrientBasis(NutrientBasis chromiumPerNutrientBasis) {
        this.chromiumPerNutrientBasis = chromiumPerNutrientBasis;
    }

    @JsonProperty("molybdenumPerNutrientBasis")
    public NutrientBasis getMolybdenumPerNutrientBasis() {
        return molybdenumPerNutrientBasis;
    }

    @JsonProperty("molybdenumPerNutrientBasis")
    public void setMolybdenumPerNutrientBasis(NutrientBasis molybdenumPerNutrientBasis) {
        this.molybdenumPerNutrientBasis = molybdenumPerNutrientBasis;
    }

    @JsonProperty("iodinePerNutrientBasis")
    public NutrientBasis getIodinePerNutrientBasis() {
        return iodinePerNutrientBasis;
    }

    @JsonProperty("iodinePerNutrientBasis")
    public void setIodinePerNutrientBasis(NutrientBasis iodinePerNutrientBasis) {
        this.iodinePerNutrientBasis = iodinePerNutrientBasis;
    }

    @JsonProperty("energyPerNutrientBasis")
    public NutrientBasis getEnergyPerNutrientBasis() {
        return energyPerNutrientBasis;
    }

    @JsonProperty("energyPerNutrientBasis")
    public void setEnergyPerNutrientBasis(NutrientBasis energyPerNutrientBasis) {
        this.energyPerNutrientBasis = energyPerNutrientBasis;
    }

    @JsonProperty("energyFromFatPerNutrientBasis")
    public NutrientBasis getEnergyFromFatPerNutrientBasis() {
        return energyFromFatPerNutrientBasis;
    }

    @JsonProperty("energyFromFatPerNutrientBasis")
    public void setEnergyFromFatPerNutrientBasis(NutrientBasis energyFromFatPerNutrientBasis) {
        this.energyFromFatPerNutrientBasis = energyFromFatPerNutrientBasis;
    }

    @JsonProperty("ingredient")
    public Ingredient getIngredient() {
        return ingredient;
    }

    @JsonProperty("ingredient")
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @JsonProperty("ingredientOfConcern")
    public LanguageValue[] getIngredientOfConcern() {
        return ingredientOfConcern;
    }

    @JsonProperty("ingredientOfConcern")
    public void setIngredientOfConcern(LanguageValue[] ingredientOfConcern) {
        this.ingredientOfConcern = ingredientOfConcern;
    }

    @JsonProperty("colourCode")
    public ColourCode getColourCode() {
        return colourCode;
    }

    @JsonProperty("colourCode")
    public void setColourCode(ColourCode colourCode) {
        this.colourCode = colourCode;
    }

    @JsonProperty("additionalProductClassification")
    public AdditionalProductClassification getAdditionalProductClassification() {
        return additionalProductClassification;
    }

    @JsonProperty("additionalProductClassification")
    public void setAdditionalProductClassification(AdditionalProductClassification additionalProductClassification) {
        this.additionalProductClassification = additionalProductClassification;
    }

    @JsonProperty("consumerSalesCondition")
    public SimpleCode[] getConsumerSalesCondition() {
        return consumerSalesCondition;
    }

    @JsonProperty("consumerSalesCondition")
    public void setConsumerSalesCondition(SimpleCode[] consumerSalesCondition) {
        this.consumerSalesCondition = consumerSalesCondition;
    }

    @JsonProperty("targetMarket")
    public TargetMarket getTargetMarket() {
        return targetMarket;
    }

    @JsonProperty("targetMarket")
    public void setTargetMarket(TargetMarket targetMarket) {
        this.targetMarket = targetMarket;
    }

    @JsonProperty("sizeCode")
    public SizeCode[] getSizeCode() {
        return sizeCode;
    }

    @JsonProperty("sizeCode")
    public void setSizeCode(SizeCode[] sizeCode) {
        this.sizeCode = sizeCode;
    }

    @JsonProperty("certification")
    public Certification getCertification() {
        return certification;
    }

    @JsonProperty("certification")
    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    @JsonProperty("awardPrize")
    public AwardPrize getAwardPrize() {
        return awardPrize;
    }

    @JsonProperty("awardPrize")
    public void setAwardPrize(AwardPrize awardPrize) {
        this.awardPrize = awardPrize;
    }

    @JsonProperty("referencedFile")
    public ReferencedFile getReferencedFile() {
        return referencedFile;
    }

    @JsonProperty("referencedFile")
    public void setReferencedFile(ReferencedFile referencedFile) {
        this.referencedFile = referencedFile;
    }

    @JsonProperty("dependentProprietaryProduct")
    public SimpleCode[] getDependentProprietaryProduct() {
        return dependentProprietaryProduct;
    }

    @JsonProperty("dependentProprietaryProduct")
    public void setDependentProprietaryProduct(SimpleCode[] dependentProprietaryProduct) {
        this.dependentProprietaryProduct = dependentProprietaryProduct;
    }

    @JsonProperty("equivalentProduct")
    public SimpleCode[] getEquivalentProduct() {
        return equivalentProduct;
    }

    @JsonProperty("equivalentProduct")
    public void setEquivalentProduct(SimpleCode[] equivalentProduct) {
        this.equivalentProduct = equivalentProduct;
    }

    @JsonProperty("organicClaim")
    public OrganicClaim getOrganicClaim() {
        return organicClaim;
    }

    @JsonProperty("organicClaim")
    public void setOrganicClaim(OrganicClaim organicClaim) {
        this.organicClaim = organicClaim;
    }

    @JsonProperty("additive")
    public Additive getAdditive() {
        return additive;
    }

    @JsonProperty("additive")
    public void setAdditive(Additive additive) {
        this.additive = additive;
    }

    @JsonProperty("hasAllergen")
    public HasAllergen[] getHasAllergen() {
        return hasAllergen;
    }

    @JsonProperty("hasAllergen")
    public void setHasAllergen(HasAllergen [] hasAllergen) {
        this.hasAllergen = hasAllergen;
    }

    @JsonProperty("dietCode")
    public DietCode getDietCode() {
        return dietCode;
    }

    @JsonProperty("dietCode")
    public void setDietCode(DietCode dietCode) {
        this.dietCode = dietCode;
    }

    @JsonProperty("dietTypeDescription")
    public LanguageValue[] getDietTypeDescription() {
        return dietTypeDescription;
    }

    @JsonProperty("dietTypeDescription")
    public void setDietTypeDescription(LanguageValue[] dietTypeDescription) {
        this.dietTypeDescription = dietTypeDescription;
    }

    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Size size) {
        this.size = size;
    }

    @JsonProperty("textileMaterial")
    public TextileMaterial getTextileMaterial() {
        return textileMaterial;
    }

    @JsonProperty("textileMaterial")
    public void setTextileMaterial(TextileMaterial textileMaterial) {
        this.textileMaterial = textileMaterial;
    }

    @JsonProperty("upperMaterialType")
    public TextileMaterial getUpperMaterialType() {
        return upperMaterialType;
    }

    @JsonProperty("upperMaterialType")
    public void setUpperMaterialType(TextileMaterial upperMaterialType) {
        this.upperMaterialType = upperMaterialType;
    }

    @JsonProperty("packaging")
    public Packaging getPackaging() {
        return packaging;
    }

    @JsonProperty("packaging")
    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    @JsonProperty("packagingMaterial")
    public PackagingMaterial getPackagingMaterial() {
        return packagingMaterial;
    }

    @JsonProperty("packagingMaterial")
    public void setPackagingMaterial(PackagingMaterial packagingMaterial) {
        this.packagingMaterial = packagingMaterial;
    }

    @JsonProperty("hasReturnablePackageDeposit")
    public HasReturnablePackageDeposit getHasReturnablePackageDeposit() {
        return hasReturnablePackageDeposit;
    }

    @JsonProperty("hasReturnablePackageDeposit")
    public void setHasReturnablePackageDeposit(HasReturnablePackageDeposit hasReturnablePackageDeposit) {
        this.hasReturnablePackageDeposit = hasReturnablePackageDeposit;
    }
}