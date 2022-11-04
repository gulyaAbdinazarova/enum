public enum Week {
    MONDAY ("ДУЙШОМБУ"),
    TUESDAY("ШЕЙШЕМБИ"),
    WEDNESDAY("ШАРШЕМБИ"),
    THURSDAY("БЕЙШЕНБИ"),
    FRIDAY("ЖУМА"),
    SATURDAY("ИШЕМБИ"),
    SANDAY("ЖЕКШЕМБИ");

    private String name;

    Week(String name) {
        this.name = name;
    } public void method(){
        System.out.println("АПТАНЫН АТАЛЫШЫ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
