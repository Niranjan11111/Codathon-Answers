def solve():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    matrix = []
    idx = 1
    for i in range(n):
        row = []
        for j in range(n):
            row.append(int(data[idx]))
            idx += 1
        matrix.append(row)
    
    # Step 1: Collect all unique salaries
    unique_salaries = set()
    for i in range(n):
        for j in range(n):
            unique_salaries.add(matrix[i][j])
    
    # Convert unique salaries to a sorted list
    sorted_salaries = sorted(unique_salaries)
    k = len(sorted_salaries)
    
    # Step 2: Create a mapping from salary to employee number
    salary_to_employee = {salary: idx + 1 for idx, salary in enumerate(sorted_salaries)}
    
    # Step 3: Determine the head of the company
    head = salary_to_employee[sorted_salaries[-1]]
    
    # Step 4: Create a list of employee salaries
    employee_salaries = [0] * (k + 1)
    for salary, emp_num in salary_to_employee.items():
        employee_salaries[emp_num] = salary
    
    # Step 5: Determine direct supervisor relationships
    direct_supervisors = [-1] * (k + 1)
    for i in range(n):
        for j in range(i + 1, n):
            common_supervisor_salary = matrix[i][j]
            common_supervisor = salary_to_employee[common_supervisor_salary]
            emp1 = salary_to_employee[matrix[i][i]]
            emp2 = salary_to_employee[matrix[j][j]]
            
            if direct_supervisors[emp1] == -1 or employee_salaries[direct_supervisors[emp1]] > common_supervisor_salary:
                direct_supervisors[emp1] = common_supervisor
            if direct_supervisors[emp2] == -1 or employee_salaries[direct_supervisors[emp2]] > common_supervisor_salary:
                direct_supervisors[emp2] = common_supervisor
    
    # Output the results
    print(k)
    print(" ".join(map(str, employee_salaries[1:])))
    print(head)
    
    supervisor_pairs = []
    for i in range(1, k + 1):
        if i != head:
            supervisor_pairs.append((i, direct_supervisors[i]))
    
    supervisor_pairs.sort()
    for u, v in supervisor_pairs:
        print(u, v)

# Read input and call solve function
solve()