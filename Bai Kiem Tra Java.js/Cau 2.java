System.out.println("Enter new information for Employee ID " + id + ":");
                            employee.inputInfo();
                            System.out.println("Employee updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee ID not found!");
                    }
                    break;

                case 3:
                    if (employeeList.isEmpty()) {
                        System.out.println("\nNo employees in the list.");
                    } else {
                        System.out.println("\nList of all Employees:");
                        for (Employee employee : employeeList) {
                            System.out.println("-------------------");
                            employee.displayInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}