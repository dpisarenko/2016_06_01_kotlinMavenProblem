package prjA

import org.junit.Test
import com.mycompany.ValidationResult
import com.mycompany.utils.createCorrectValidationResult

/**
 * @author Dmitri Pisarenko (dp@altruix.co)
 * @version $Id$
 * @since 1.0
 */
class SomeTest {
    @Test
    fun prjACanReferencePrjBStuff() {
        val valRes = ValidationResult()
        val correctValRes = createCorrectValidationResult()
    }
}
