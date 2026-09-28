package oops_assignments;

class ManagerEmployee extends EmployeeBase implements BonusFeature {

    void work() {
        System.out.println("Manager is managing the team");
    }

    public void calculateBonus() {
        System.out.println("Manager bonus is 10000");
    }

}