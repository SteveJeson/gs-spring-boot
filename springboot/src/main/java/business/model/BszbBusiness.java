package business.model;


import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * bszb_business(BszbBusiness)模型对象
 * @version 1.0
 * @author: eazer
 */
public class BszbBusiness {
	//======================字段列表========================
	/** UNID */
	private Integer	businessUnid;

	/** UUID */
	@Id
	private String	businessUuid;

	/** 创建时间 */
	private Date	businessCdate;

	/** 修改时间 */
	private Date	businessUdate;

	/** 创建者 */
	private String	businessCusr;

	/** 状态 （0：草稿,1：正常数据,2：失效数据,3:审核完成） */
	private Byte	businessStatus;

	/** 客户UUID */
	private String	businessCusuuid;

	/** 客户姓名 */
	private String	businessCusname;

	/** 业务分表UUID */
	private String	businessItemuuid;

	/** 金额 */
	private Double	businessPrice;

	/** 业务名称 */
	private String	businessName;

	/** 业务类别 */
	private String	businessType;

	/** 押金 */
	private Double	businessIndeposit;

	/** 合同编号 */
	private String	businessNo;

	/** 合同开始时间 */
	private Date	businessBeginDate;

	/** 合同结束时间 */
	private Date	businessEndDate;

	/** 是否开票 (0:否|1:是) */
	private Byte	businessInvoice;

	/** 是否确认完 (0:否|1:是) */
	private Byte	businessConfirm;

	/** 签约公司UUID */
	private String	businessOrguuid;

	/** 押金退还UUID */
	private String	businessIbackuuid;

	public Integer getBusinessUnid() {
		return this.businessUnid;
	}

	public void setBusinessUnid(Integer businessUnid) {
		this.businessUnid = businessUnid;
	}

	public String getBusinessUuid() {
		return this.businessUuid;
	}

	public void setBusinessUuid(String businessUuid) {
		this.businessUuid = businessUuid;
	}

	public Date getBusinessCdate() {
		return this.businessCdate;
	}

	public void setBusinessCdate(Date businessCdate) {
		this.businessCdate = businessCdate;
	}

	public Date getBusinessUdate() {
		return this.businessUdate;
	}

	public void setBusinessUdate(Date businessUdate) {
		this.businessUdate = businessUdate;
	}

	public String getBusinessCusr() {
		return this.businessCusr;
	}

	public void setBusinessCusr(String businessCusr) {
		this.businessCusr = businessCusr;
	}

	public Byte getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(Byte businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getBusinessCusuuid() {
		return this.businessCusuuid;
	}

	public void setBusinessCusuuid(String businessCusuuid) {
		this.businessCusuuid = businessCusuuid;
	}

	public String getBusinessCusname() {
		return this.businessCusname;
	}

	public void setBusinessCusname(String businessCusname) {
		this.businessCusname = businessCusname;
	}

	public String getBusinessItemuuid() {
		return this.businessItemuuid;
	}

	public void setBusinessItemuuid(String businessItemuuid) {
		this.businessItemuuid = businessItemuuid;
	}

	public Double getBusinessPrice() {
		return this.businessPrice;
	}

	public void setBusinessPrice(Double businessPrice) {
		this.businessPrice = businessPrice;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public Double getBusinessIndeposit() {
		return this.businessIndeposit;
	}

	public void setBusinessIndeposit(Double businessIndeposit) {
		this.businessIndeposit = businessIndeposit;
	}

	public String getBusinessNo() {
		return this.businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public Date getBusinessBeginDate() {
		return this.businessBeginDate;
	}

	public void setBusinessBeginDate(Date businessBeginDate) {
		this.businessBeginDate = businessBeginDate;
	}

	public Date getBusinessEndDate() {
		return this.businessEndDate;
	}

	public void setBusinessEndDate(Date businessEndDate) {
		this.businessEndDate = businessEndDate;
	}

	public Byte getBusinessInvoice() {
		return this.businessInvoice;
	}

	public void setBusinessInvoice(Byte businessInvoice) {
		this.businessInvoice = businessInvoice;
	}

	public Byte getBusinessConfirm() {
		return this.businessConfirm;
	}

	public void setBusinessConfirm(Byte businessConfirm) {
		this.businessConfirm = businessConfirm;
	}

	public String getBusinessOrguuid() {
		return this.businessOrguuid;
	}

	public void setBusinessOrguuid(String businessOrguuid) {
		this.businessOrguuid = businessOrguuid;
	}

	public String getBusinessIbackuuid() {
		return this.businessIbackuuid;
	}

	public void setBusinessIbackuuid(String businessIbackuuid) {
		this.businessIbackuuid = businessIbackuuid;
	}


	//==================定制内容开始======================



    //==================定制内容结束======================
}
