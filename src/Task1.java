class Organization {
    protected String name;
    protected String address;
    protected int employees;

    public Organization(String name, String address, int employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public void Show() {
        System.out.println("Організація: " + name);
        System.out.println("Адреса: " + address);
        System.out.println("Кількість співробітників: " + employees);
    }
}

class InsuranceCompany extends Organization {
    private String insuranceType;

    public InsuranceCompany(String name, String address, int employees, String insuranceType) {
        super(name, address, employees);
        this.insuranceType = insuranceType;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Тип страхування: " + insuranceType);
    }
}

class OilAndGasCompany extends Organization {
    private int oilProduction;

    public OilAndGasCompany(String name, String address, int employees, int oilProduction) {
        super(name, address, employees);
        this.oilProduction = oilProduction;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Виробництво нафти: " + oilProduction + " барелів на день");
    }
}

class Factory extends Organization {
    private String productType;

    public Factory(String name, String address, int employees, String productType) {
        super(name, address, employees);
        this.productType = productType;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Тип продукції: " + productType);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Organization[] organizations = new Organization[3];

        organizations[0] = new InsuranceCompany("Alpha Insurance", "Київ, вул. Садова, 10", 150, "Медичне страхування");
        organizations[1] = new OilAndGasCompany("OilGas Ltd", "Харків, вул. Нафтова, 15", 300, 50000);
        organizations[2] = new Factory("SteelWorks", "Одеса, вул. Заводська, 20", 500, "Сталь");

        for (Organization org : organizations) {
            org.Show();
            System.out.println();
        }
    }
}
