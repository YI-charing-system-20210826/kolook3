package com.example.security.customer;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CustomerUpdateRequest extends CustomerRequest implements Serializable {
  /**
   * ユーザーID
   */
  @NotNull
  private Long id;
}