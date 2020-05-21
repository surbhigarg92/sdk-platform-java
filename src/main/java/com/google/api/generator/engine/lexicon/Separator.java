package com.google.api.generator.engine.lexicon;

import com.google.common.collect.ImmutableList;
import java.util.regex.Pattern;

public class Separator {
  private static final ImmutableList<String> SEPARATORS =
      ImmutableList.of("(", ")", "{", "}", "[", "]", ",", ".", ";");
  private static final Pattern SEPARATOR_PATTERN = Pattern.compile("[\\[\\]\\{\\}\\(\\)\\.]");

  public static boolean containsSeparator(String str) {
    return SEPARATOR_PATTERN.matcher(str).find();
  }
}
