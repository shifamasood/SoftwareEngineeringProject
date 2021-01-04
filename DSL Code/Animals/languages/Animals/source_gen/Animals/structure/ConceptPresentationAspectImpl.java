package Animals.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Animals;
  private ConceptPresentation props_Canvas;
  private ConceptPresentation props_Cat;
  private ConceptPresentation props_Dog;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Animals:
        if (props_Animals == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Animals = cpb.create();
        }
        return props_Animals;
      case LanguageConceptSwitch.Canvas:
        if (props_Canvas == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Canvas = cpb.create();
        }
        return props_Canvas;
      case LanguageConceptSwitch.Cat:
        if (props_Cat == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("cat");
          props_Cat = cpb.create();
        }
        return props_Cat;
      case LanguageConceptSwitch.Dog:
        if (props_Dog == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("dog");
          props_Dog = cpb.create();
        }
        return props_Dog;
    }
    return null;
  }
}
