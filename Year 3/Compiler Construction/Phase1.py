from ply import lex

## List of Token Names 

tokens = [
    'INT',
    'FLOAT',
    'SCIENTIFIC',
    'VAR',
    'ADD',
    'SUB',
    'MUL',
    'DIV',
    'INT_DIV',
    'EXP',
    'GRTN', #Greater Than
    'GRTN_EQ', #Greater Than or Equal To
    'LSTN', #Less Than
    'LSTN_EQ', #Less Than or Equal To
    'EQ',
    'ASSGN',
    'NOT_EQ',
    'L_PAREN',
    'R_PAREN',
    'ERR'
]


## Regular Expression rules for simple tokens.

t_ADD       = r'\+'
t_SUB       = r'\-'
t_MUL       = r'\*'
t_DIV       = r'\/'
t_INT_DIV   = r'\/\/'
t_EXP       = r'\^'
t_GRTN      = r'\>'
t_GRTN_EQ   = r'\>\='
t_LSTN      = r'\<'
t_LSTN_EQ   = r'\<\='
t_EQ        = r'\=\='
t_ASSGN    = r'\='
t_NOT_EQ    = r'\!\='
t_L_PAREN    = r'\('
t_R_PAREN    = r'\)'

t_ERR = r'[^a-zA-Z0-9_+\-*/>=<=!\.^()]'  # Any other character is an error
t_ignore    = ' \t'

t_INT = r'\d+'
t_FLOAT = r'\d+\.\d+'
t_SCIENTIFIC = r'\d+[eE][-+]?\d+'
t_VAR = r'[a-zA-Z_][a-zA-Z0-9_]*'

def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)

def t_error(t):
    print(f"Illegal character '{t.value[0]}' at position {t.lexpos}")
    t.lexer.skip(1)

# Build the lexer
lexer = lex.lex()

# Test the lexer
input_expression = "23 + 8\n2.5 * 0\n5NUM^ 3.0\nx = 5\n10 * x\nx = y\nx != 5\nX# + 8"
lexer.input(input_expression)
while True:
    tok = lexer.token()
    if not tok:
        break
    print(f'{tok.value}/{tok.type}', end=' ')
print()
