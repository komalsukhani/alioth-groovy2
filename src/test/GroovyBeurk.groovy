import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer
import org.codehaus.groovy.control.customizers.SecureASTCustomizer
import static org.codehaus.groovy.syntax.Types.*

final ImportCustomizer imports = new ImportCustomizer().addStaticStars('java.lang.Math')
final SecureASTCustomizer secure = new SecureASTCustomizer()

secure.with {
    closuresAllowed = false
    methodDefinitionAllowed = false

    importsWhitelist = []
    staticImportsWhitelist = []
    staticStarImportsWhitelist = ['java.lang.Math'] // only java.lang.Math is allowed

    tokensWhitelist = [
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE,
            MOD,
            POWER,
            PLUS_PLUS,
            MINUS_MINUS,
            COMPARE_EQUAL,
            COMPARE_NOT_EQUAL,
            COMPARE_LESS_THAN,
            COMPARE_LESS_THAN_EQUAL,
            COMPARE_GREATER_THAN,
            COMPARE_GREATER_THAN_EQUAL,
    ].asImmutable()

    constantTypesClassesWhiteList = [
            Integer,
            Float,
            Long,
            Double,
            BigDecimal,
            Integer.TYPE,
            Long.TYPE,
            Float.TYPE,
            Double.TYPE
    ].asImmutable()

    receiversClassesWhiteList = [
            Math,
            Integer,
            Float,
            Double,
            Long,
            BigDecimal
    ].asImmutable()
}
def config = new CompilerConfiguration()
config.addCompilationCustomizers(imports, secure)
def shell = new GroovyShell(config)
def result = shell.evaluate('1+cos(PI/2)')
assert result==1