package org.example;

import java.util.List;

// <properties>
//     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//     <maven.compiler.source>1.8</maven.compiler.source>
//     <maven.compiler.target>1.8</maven.compiler.target>
// </properties>

// public class Unit {
//     private String name;
//     private List<String> topics;
//     public Unit(String name, List<String> topics) {
//         this.name = name;
//         this.topics = topics;
//     }
//     public String getName() { return this.name; }
//     public List<String> getTopics() { return this.topics; }
// }

// <maven.compiler.release>17</maven.compiler.release>
public record Unit(String name, List<String> topics) {}
