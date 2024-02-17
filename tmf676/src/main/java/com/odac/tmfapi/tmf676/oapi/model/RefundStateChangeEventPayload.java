package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.odac.tmfapi.tmf676.oapi.model.Refund;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "RefundStateChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RefundStateChangeEventPayload implements Serializable {

  private static final long serialVersionUID = 1L;

  private Refund refund;

  public RefundStateChangeEventPayload refund(Refund refund) {
    this.refund = refund;
    return this;
  }

  /**
   * Get refund
   * @return refund
  */
  @Valid 
  @Schema(name = "refund", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refund")
  public Refund getRefund() {
    return refund;
  }

  public void setRefund(Refund refund) {
    this.refund = refund;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundStateChangeEventPayload refundStateChangeEventPayload = (RefundStateChangeEventPayload) o;
    return Objects.equals(this.refund, refundStateChangeEventPayload.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refund);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundStateChangeEventPayload {\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

