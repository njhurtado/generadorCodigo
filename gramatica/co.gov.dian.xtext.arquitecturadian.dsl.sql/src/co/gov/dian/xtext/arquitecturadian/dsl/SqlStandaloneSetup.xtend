/*
 * generated by Xtext 2.12.0
 */
package co.gov.dian.xtext.arquitecturadian.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SqlStandaloneSetup extends SqlStandaloneSetupGenerated {

	def static void doSetup() {
		new SqlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
