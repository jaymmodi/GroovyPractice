/**
 * Created by jay on 6/8/16.
 */
import groovy.xml.MarkupBuilder

class FirstGroovyProject {

    static void main(String[] args) {
        def name = "jay";
        println(name);

        def xml = new MarkupBuilder();
        println(xml.hashCode());
    }
}
