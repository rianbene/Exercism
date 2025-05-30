class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department != null){
            return name + " - " + department.toUpperCase();  
        }
        if (id != null && department == null){
            return "[" + id + "]" + " - " + name + " - " + "OWNER";
        }
        if (id == null && department == null){
            return name + " - " + "OWNER";
        }
        return "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
    }
}
