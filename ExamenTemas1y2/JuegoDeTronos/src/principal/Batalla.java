package principal;

import java.io.Serializable;

public class Batalla implements Serializable {
    String name;
    private int year; private int battle_number; private String attacker_king; private String defender_king;
    private String [] attackers; private String [] defenders; private String attacker_outcome;
    private String battle_type; private String major_death; private String major_capture; private int attacker_size;
    private int defender_size; private String attacker_commander; private String defender_commander; private String summer;
    private String location; private String region; private String note;

    public Batalla(String name, int year, int battle_number, String attacker_king, String defender_king,
            String attacker_1, String attacker_2, String attacker_3, String attacker_4, String defender_1,
            String defender_2, String defender_3, String defender_4, String attacker_outcome,
            String battle_type, String major_death, String major_capture, int attacker_size,
            int defender_size, String attacker_commander, String defender_commander, String summer,
            String location, String region, String note) {
        this.name=name;
        this.year=year;
        this.battle_number=battle_number;
        this.attacker_king=attacker_king;
        this.defender_king=defender_king;
        this.attackers=new String[4];
        this.attackers[0]=attacker_1;
        this.attackers[1]=attacker_2;
        this.attackers[2]=attacker_3;
        this.attackers[3]=attacker_4;
        this.defenders=new String[4];
        this.defenders[0]=defender_1;
        this.defenders[1]=defender_2;
        this.defenders[2]=defender_3;
        this.defenders[3]=defender_4;
        this.attacker_outcome=attacker_outcome;
        this.battle_type=battle_type;
        this.major_death=major_death;
        this.major_capture=major_capture;
        this.attacker_size=attacker_size;
        this.defender_size=defender_size;
        this.attacker_commander=attacker_commander;
        this.defender_commander=defender_commander;
        this.summer=summer;
        this.location=location;
        this.region=region;
        this.note=note;

    }

    @Override
    public String toString() {
        return "Batalla:"+this.name+' '+this.year+' '+this.battle_number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setBattle_number(int battle_number) {
        this.battle_number = battle_number;
    }
    public void setAttacker_king(String attacker_king) {
        this.attacker_king = attacker_king;
    }
    public void setDefender_king(String defender_king) {
        this.defender_king = defender_king;
    }
    public void setAttackers(String [] attackers) {
        this.attackers = attackers;
    }
    
    public void setDefenders(String [] defenders) {
        this.defenders = defenders;
    }
    public void setAttacker_outcome(String attacker_outcome) {
        this.attacker_outcome = attacker_outcome;
    }
    public void setBattle_type(String battle_type) {
        this.battle_type = battle_type;
    }
    public void setMajor_death(String major_death) {
        this.major_death = major_death;
    }
    public void setMajor_capture(String major_capture) {
        this.major_capture = major_capture;
    }
    public void setAttacker_size(int attacker_size) {
        this.attacker_size = attacker_size;
    }
    public void setDefender_size(int defender_size) {
        this.defender_size = defender_size;
    }
    public void setAttacker_commander(String attacker_commander) {
        this.attacker_commander = attacker_commander;
    }
    public void setDefender_commander(String defender_commander) {
        this.defender_commander = defender_commander;
    }
    public void setSummer(String summer) {
        this.summer = summer;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public int getBattle_number() {
        return battle_number;
    }
    public String getAttacker_king() {
        return attacker_king;
    }
    public String getDefender_king() {
        return defender_king;
    }
    public String [] getAttackers() {
        return attackers;
    }
    
    public String [] getDefenders() {
        return defenders;
    }
    
    public String getAttacker_outcome() {
        return attacker_outcome;
    }
    public String getBattle_type() {
        return battle_type;
    }
    public String getMajor_death() {
        return major_death;
    }
    public String getMajor_capture() {
        return major_capture;
    }
    public int getAttacker_size() {
        return attacker_size;
    }
    public int getDefender_size() {
        return defender_size;
    }
    public String getAttacker_commander() {
        return attacker_commander;
    }
    public String getDefender_commander() {
        return defender_commander;
    }
    public String getSummer() {
        return summer;
    }
    public String getLocation() {
        return location;
    }
    public String getRegion() {
        return region;
    }
    public String getNote() {
        return note;
    }
    
}
