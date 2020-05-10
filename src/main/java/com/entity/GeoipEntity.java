package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "geoip", schema = "mixmind", catalog = "")
public class GeoipEntity {
    private int geonameId;
    private String localeCode;
    private String continentCode;
    private String continentName;
    private String countryIsoCode;
    private String countryName;
    private Integer isInEuropeanUnion;
    private int idCountry;

    @Basic
    @Column(name = "geoname_id", nullable = false)
    public int getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(int geonameId) {
        this.geonameId = geonameId;
    }

    @Basic
    @Column(name = "locale_code", nullable = true, length = 45)
    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    @Basic
    @Column(name = "continent_code", nullable = true, length = 45)
    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    @Basic
    @Column(name = "continent_name", nullable = true, length = 45)
    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    @Basic
    @Column(name = "country_iso_code", nullable = true, length = 45)
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    @Basic
    @Column(name = "country_name", nullable = true, length = 45)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "is_in_european_union", nullable = true)
    public Integer getIsInEuropeanUnion() {
        return isInEuropeanUnion;
    }

    public void setIsInEuropeanUnion(Integer isInEuropeanUnion) {
        this.isInEuropeanUnion = isInEuropeanUnion;
    }

    @Id
    @Column(name = "id_country", nullable = false)
    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoipEntity that = (GeoipEntity) o;
        return geonameId == that.geonameId &&
                idCountry == that.idCountry &&
                Objects.equals(localeCode, that.localeCode) &&
                Objects.equals(continentCode, that.continentCode) &&
                Objects.equals(continentName, that.continentName) &&
                Objects.equals(countryIsoCode, that.countryIsoCode) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(isInEuropeanUnion, that.isInEuropeanUnion);
    }

    @Override
    public int hashCode() {

        return Objects.hash(geonameId, localeCode, continentCode, continentName, countryIsoCode, countryName, isInEuropeanUnion, idCountry);
    }
}
