# Create model using basic building blocks

## Your task
Create model of each domain discovered in the previous task. Separate application logic and domain logic. Respect the requirements and domain rules according to the original document.

Let's start with simple manual investments
- Invest manually into one of projects
- Invest into assets

### Propose aggregates and entities
1. Start with responsibilities (methods) and group methods according to rules (invariants)
2. Create internal structure of aggregates
   1. Group entities and value objects according to rules (invariants)
3. Leave class names for the end
4. If you are not sure about the relations between aggregates, use Gibberish Game.

### Solution
You can find solutions in the [solutions](..%2F..%2Fsrc%2Fmain%2Fjava%2Fpl%2Fwojtyna%2Ftrainings%2Frecipes%2Fcrowdsorcery%2Fsolutions) package.

## Discussion
- What are the relationships between your aggregates and entities?
- Do you think your model is complete?
- How did you decide on the boundaries of your aggregates?