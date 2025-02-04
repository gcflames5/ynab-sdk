/*
 * YNAB API Endpoints
 * Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.youneedabudget.com
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ynab.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import ynab.client.model.SubTransaction;
import ynab.client.model.TransactionSummary;

/**
 * TransactionDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T01:42:20.552-05:00")
public class TransactionDetail {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  /**
   * The cleared status of the transaction
   */
  @JsonAdapter(ClearedEnum.Adapter.class)
  public enum ClearedEnum {
    CLEARED("cleared"),
    
    UNCLEARED("uncleared"),
    
    RECONCILED("reconciled");

    private String value;

    ClearedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClearedEnum fromValue(String text) {
      for (ClearedEnum b : ClearedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ClearedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClearedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClearedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClearedEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("cleared")
  private ClearedEnum cleared = null;

  @SerializedName("approved")
  private Boolean approved = null;

  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("account_name")
  private String accountName = null;

  @SerializedName("subtransactions")
  private List<SubTransaction> subtransactions = new ArrayList<SubTransaction>();

  @SerializedName("memo")
  private String memo = null;

  public TransactionDetail id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TransactionDetail date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public TransactionDetail amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount in milliunits format
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount in milliunits format")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionDetail cleared(ClearedEnum cleared) {
    this.cleared = cleared;
    return this;
  }

   /**
   * The cleared status of the transaction
   * @return cleared
  **/
  @ApiModelProperty(required = true, value = "The cleared status of the transaction")
  public ClearedEnum getCleared() {
    return cleared;
  }

  public void setCleared(ClearedEnum cleared) {
    this.cleared = cleared;
  }

  public TransactionDetail approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Whether or not the transaction is approved
   * @return approved
  **/
  @ApiModelProperty(required = true, value = "Whether or not the transaction is approved")
  public Boolean isApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public TransactionDetail accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public TransactionDetail deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether or not the transaction has been deleted.  Deleted transactions will only be included in delta requests.
   * @return deleted
  **/
  @ApiModelProperty(required = true, value = "Whether or not the transaction has been deleted.  Deleted transactions will only be included in delta requests.")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public TransactionDetail accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public TransactionDetail memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   * @return memo
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public TransactionDetail subtransactions(List<SubTransaction> subtransactions) {
    this.subtransactions = subtransactions;
    return this;
  }

  public TransactionDetail addSubtransactionsItem(SubTransaction subtransactionsItem) {
    this.subtransactions.add(subtransactionsItem);
    return this;
  }

   /**
   * If a split transaction, the subtransactions.
   * @return subtransactions
  **/
  @ApiModelProperty(required = true, value = "If a split transaction, the subtransactions.")
  public List<SubTransaction> getSubtransactions() {
    return subtransactions;
  }

  public void setSubtransactions(List<SubTransaction> subtransactions) {
    this.subtransactions = subtransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetail transactionDetail = (TransactionDetail) o;
    return Objects.equals(this.id, transactionDetail.id) &&
        Objects.equals(this.date, transactionDetail.date) &&
        Objects.equals(this.amount, transactionDetail.amount) &&
        Objects.equals(this.cleared, transactionDetail.cleared) &&
        Objects.equals(this.approved, transactionDetail.approved) &&
        Objects.equals(this.accountId, transactionDetail.accountId) &&
        Objects.equals(this.deleted, transactionDetail.deleted) &&
        Objects.equals(this.accountName, transactionDetail.accountName) &&
        Objects.equals(this.subtransactions, transactionDetail.subtransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, amount, cleared, approved, accountId, deleted, accountName, subtransactions, memo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    subtransactions: ").append(toIndentedString(subtransactions)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

