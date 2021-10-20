package scoreboard;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alejo
 */
class Player {
    private String nickname, twitter, sponsor;
    private boolean caster;

    public Player(String nickname, String twitter, String sponsor, boolean caster) {
        this.nickname = nickname;
        this.twitter = twitter;
        this.sponsor = sponsor;
        this.caster = caster;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public boolean isCaster() {
        return caster;
    }

    public void setCaster(boolean caster) {
        this.caster = caster;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
    public String toCSV() {
        return nickname + "," + twitter + "," + sponsor + "," + caster + System.lineSeparator();
    }
    
    
    
}
