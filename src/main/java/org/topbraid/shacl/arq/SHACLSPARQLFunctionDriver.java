package org.topbraid.shacl.arq;

import org.topbraid.shacl.model.SHFunction;
import org.topbraid.spin.arq.SPINFunctionDriver;
import org.topbraid.spin.arq.SPINFunctionFactory;

import org.apache.jena.rdf.model.Resource;


/**
 * A SPINFunctionDriver using sh:sparql to find an executable
 * body for a SHACL function.
 * 
 * This class currently relies on infrastructure from the SPIN API.
 * 
 * @author Holger Knublauch
 */
public class SHACLSPARQLFunctionDriver implements SPINFunctionDriver {

	@Override
	public SPINFunctionFactory create(Resource shaclFunction) {
		return new SHACLARQFunction(shaclFunction.as(SHFunction.class));
	}
}
