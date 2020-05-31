public class Weight {
    private String ip;
    private Integer weight;
    private Integer dynamicWeight;

    public Weight(String ip, Integer weight, Integer dynamicWeight) {
        this.ip = ip;
        this.weight = weight;
        this.dynamicWeight = dynamicWeight;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDynamicWeight() {
        return dynamicWeight;
    }

    public void setDynamicWeight(Integer dynamicWeight) {
        this.dynamicWeight = dynamicWeight;
    }
}
