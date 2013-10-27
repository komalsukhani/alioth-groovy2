

    import groovy.transform.ASTTest
    import static org.codehaus.groovy.control.CompilePhase.*
    import static org.codehaus.groovy.transform.stc.StaticTypesMarker.*
    import static org.codehaus.groovy.ast.ClassHelper.*

    int n = 10
    for (int i in 1..n) {
        @ASTTest(phase=INSTRUCTION_SELECTION, value= {
            assert node.getNodeMetaData(DECLARATION_INFERRED_TYPE) == int_TYPE
        })
        def j = i
    }


