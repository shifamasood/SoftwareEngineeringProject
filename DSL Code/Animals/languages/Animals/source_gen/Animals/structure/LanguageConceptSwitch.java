package Animals.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Animals = 0;
  public static final int Canvas = 1;
  public static final int Cat = 2;
  public static final int Dog = 3;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xee886be0abf5408eL, 0x8219419e0e49cb3cL);
    builder.put(0x4e93ae19daa212d0L, Animals);
    builder.put(0x4e93ae19daa212ddL, Canvas);
    builder.put(0x4e93ae19daa212d7L, Cat);
    builder.put(0x4e93ae19daa212d1L, Dog);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}