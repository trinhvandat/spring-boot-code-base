package org.dattv.codebase.swagger.ui.core.util;

import org.modelmapper.ModelMapper;

public class MapperUtils {

  private final static ModelMapper modelMapper = new ModelMapper();

  private MapperUtils() {}

  public static ModelMapper getMapper() {
    return modelMapper;
  }
}
