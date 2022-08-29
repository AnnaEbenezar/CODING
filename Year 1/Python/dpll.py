# Check whether 'clause' contains complementary literals
def tautology(clause):
    for lit in clause:
        neg_lit = '~'+lit if lit[0]!='~' else lit[1:]
        if neg_lit in clause:
            return True
    return False

# Apply simple DPLL algorithm to check satisfiability
def sat(cnf):
    # Empty clause exists means unsatisfiable
    if [] in cnf:
        return None
    
    # Remove tautologies
    new_cnf = [c for c in cnf if not tautology(c)]

    # Empty set of clauses is obviously satisfiable
    if len(new_cnf) == 0:
        return {}

    # Select a propositional letter
    lit = new_cnf[0][0]
    p = lit if lit[0]!='~' else lit[1:]
    
    # Try p true
    new_cnf_p = [c for c in new_cnf if p not in c]
    new_cnf_p = [[l for l in c if l!='~'+p] for c in new_cnf_p]
    result = sat(new_cnf_p)
    if result is not None:
        result[p] = True
        return result
    else:
        # Try p false
        new_cnf_notp = [c for c in new_cnf if '~'+p not in c]
        new_cnf_notp = [[l for l in c if l!=p] for c in new_cnf_notp]
        result = sat(new_cnf_notp)
        if result is not None:
            result[p] = False
            return result
        else:
            return None

##cnf1 = [['r','~s','t'],
##       ['p','~r','~s'],
##       ['~t'],
##       ['~p','~q','t'],
##       ['s','t'],
##       ['~p','q']]
##print(sat(cnf1))
##
##cnf2 = [['~p','t'],
##        ['p','s','r'],
##        ['~s', 't'],
##        ['p','~q'],
##        ['q','~r']]
##print(sat(cnf2))
