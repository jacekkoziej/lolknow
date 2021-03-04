package com.jacek.koziej.integration;

import java.util.Map;

public class Champions {
  private String type;
  private String format;
  private String version;
  private Map<String, Champion> data;

    public Map<String, Champion> getData() {
        return data;
    }

    public void setData(Map<String, Champion> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
