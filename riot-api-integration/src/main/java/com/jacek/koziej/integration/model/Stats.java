
package com.jacek.koziej.integration.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("hp")
    @Expose
    private String hp;
    @SerializedName("hpperlevel")
    @Expose
    private String hpperlevel;
    @SerializedName("mp")
    @Expose
    private String mp;
    @SerializedName("mpperlevel")
    @Expose
    private String mpperlevel;
    @SerializedName("movespeed")
    @Expose
    private String movespeed;
    @SerializedName("armor")
    @Expose
    private String armor;
    @SerializedName("armorperlevel")
    @Expose
    private String armorperlevel;
    @SerializedName("spellblock")
    @Expose
    private String spellblock;
    @SerializedName("spellblockperlevel")
    @Expose
    private String spellblockperlevel;
    @SerializedName("attackrange")
    @Expose
    private String attackrange;
    @SerializedName("hpregen")
    @Expose
    private String hpregen;
    @SerializedName("hpregenperlevel")
    @Expose
    private String hpregenperlevel;
    @SerializedName("mpregen")
    @Expose
    private String mpregen;
    @SerializedName("mpregenperlevel")
    @Expose
    private String mpregenperlevel;
    @SerializedName("crit")
    @Expose
    private String crit;
    @SerializedName("critperlevel")
    @Expose
    private String critperlevel;
    @SerializedName("attackdamage")
    @Expose
    private String attackdamage;
    @SerializedName("attackdamageperlevel")
    @Expose
    private String attackdamageperlevel;
    @SerializedName("attackspeedperlevel")
    @Expose
    private String attackspeedperlevel;
    @SerializedName("attackspeed")
    @Expose
    private String attackspeed;

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(String hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(String mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public String getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(String movespeed) {
        this.movespeed = movespeed;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(String armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public String getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(String spellblock) {
        this.spellblock = spellblock;
    }

    public String getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(String spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public String getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(String attackrange) {
        this.attackrange = attackrange;
    }

    public String getHpregen() {
        return hpregen;
    }

    public void setHpregen(String hpregen) {
        this.hpregen = hpregen;
    }

    public String getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(String hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public String getMpregen() {
        return mpregen;
    }

    public void setMpregen(String mpregen) {
        this.mpregen = mpregen;
    }

    public String getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(String mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public String getCrit() {
        return crit;
    }

    public void setCrit(String crit) {
        this.crit = crit;
    }

    public String getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(String critperlevel) {
        this.critperlevel = critperlevel;
    }

    public String getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(String attackdamage) {
        this.attackdamage = attackdamage;
    }

    public String getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(String attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public String getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(String attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public String getAttackspeed() {
        return attackspeed;
    }

    public void setAttackspeed(String attackspeed) {
        this.attackspeed = attackspeed;
    }
}
